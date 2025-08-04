const toggle = document.getElementById('darkSwitch');
const root = document.documentElement;

// Cargar preferencia previa
if (localStorage.getItem('dark-mode') === 'enabled') {
	root.classList.add('dark-mode');
	toggle.checked = true;
}

toggle.addEventListener('change', () => {
	if (toggle.checked) {
		root.classList.add('dark-mode');
		localStorage.setItem('dark-mode', 'enabled');
	} else {
		root.classList.remove('dark-mode');
		localStorage.setItem('dark-mode', 'disabled');
	}
});
