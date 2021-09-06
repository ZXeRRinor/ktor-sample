console.log('Hello')

const city__button = document.querySelector(".city__button");

console.log(city__button)

city__button.addEventListener('click',(e)=>{
    document.querySelector(".city__info").classList.toggle("city__info_visable");
  })