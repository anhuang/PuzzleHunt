package puzzlehunt


class HintInterceptor {

    private static final CONTROLLERS = ['player', 'hint', 'status', 'admin']
    private static final ROLES = ["HINTER": ['hint'], "PRINTER": ['hint', 'status'], "ADMIN": ['admin', 'hint', 'status'], "PLAYER" : ['player'] ]

    HintInterceptor() {
        CONTROLLERS.each {
            match controller: it
        }
    }

    int order = 100

    boolean before() {
        println "check perm ${controllerName}"

        def player = Player.findById(session.playerId)
        def role = player.role ?: "PLAYER"

        if (!(role in ROLES)) {
            redirect controller: "login"
            return false
        }
        if (!(controllerName in ROLES[role])) {
            redirect controller: ROLES[role][0]
            return false
        }

        true
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
