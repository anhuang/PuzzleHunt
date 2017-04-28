package puzzlehunt

class BootStrap {

    def init = { servletContext ->


        def a = new Puzzle(xCor:100, yCor:100, name:'Puzzle A', solution:"A")
        def b = new Puzzle(xCor:300, yCor:100, name:'Puzzle B', solution:"B")
        def c = new Puzzle(xCor:500, yCor:100, name:'Puzzle C', solution:"C")
        def d = new Puzzle(xCor:300, yCor:200, name:'Puzzle D', solution:"D", requiredPuzzles: [b])
        def e = new Puzzle(xCor:200, yCor:400, name:'Puzzle E', solution:"E", requiredPuzzles: [a, d])
        def f = new Puzzle(xCor:400, yCor:400, name:'Puzzle F', solution:"F", requiredPuzzles: [c, d])
        def g = new Puzzle(xCor:400, yCor:500, name:'Puzzle G', solution:"G", requiredPuzzles: [f])
        def h = new Puzzle(xCor:200, yCor:600, name:'Puzzle H', solution:"H", requiredPuzzles: [e, g])
        def i = new Puzzle(xCor:300, yCor:800, name:'Puzzle I', solution:"I", requiredPuzzles: [g, h])

        a.save()
        b.save()
        c.save()
        d.save()
        e.save()
        f.save()
        g.save()
        h.save()
        i.save()


        def pl = new Player(name:"Aleks", password:"1")
        pl.save()
    }
    def destroy = {
    }
}
