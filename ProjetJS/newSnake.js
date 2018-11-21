let lc,hc;
let ctx,snakeCanvas;
let snake = [];


class PartSnake {

    constructor(x, y) {
        this.x = x;
        this.y = y;
    }

    draw(ctx) {

        ctx.fillStyle = 'green';
        ctx.strokeStyle = 'black';

        ctx.fillRect(this.x, this.y, 20, 20);
        ctx.strokeRect(this.x, this.y, 20, 20);
    }
}



function createSnake(n){
    snake = [];

    for (let i = 0; i < n; i++) {
        let x = 250 + i * 20;
        let y = 250;
        let part = new PartSnake(x,y);

        snake.push(part);
    }

}



window.onload = function() {
    console.log("pret");
    snakeCanvas = document.querySelector("#snakeCanvas");
    lc = snakeCanvas.width;
    hc = snakeCanvas.height;

    ctx = snakeCanvas.getContext("2d");
    ctx.save();

    createSnake(4);

    ctx.fillStyle = 'white';
    ctx.strokeStyle = 'black';

    ctx.fillRect(0,0,lc,hc);
    ctx.strokeRect(0,0,lc,hc);

    requestAnimationFrame(anime);
    ctx.restore();

}

function drawSnake() {
    snake.forEach((r) => {
        r.draw(ctx);
    })
}

function anime() {
    //ctx.clearRect(0, 0, lc, hc);

    drawSnake();

    requestAnimationFrame(anime);
}
