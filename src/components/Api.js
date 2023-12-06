export default class Api {
  static fazer(url, method = "GET", body = null) {
    fetch(url, {
      method: method,
      headers: {
        Accept: "application/json",
        "Content-Type": "application/json",
      },

      body: JSON.stringify({
        body,
      }),
    }).then((response) => {
      return response;
    });
  }
}
