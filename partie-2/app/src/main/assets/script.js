const btn = document.querySelector("#btn")
btn.addEventListener('click', function() {
    const val = document.querySelector("input[name='text']").value
    Bridge.sendDataFromWebView(JSON.stringify({name:val}))
})

function getData(data) {
document.querySelector("input[name='text']").value = data
}