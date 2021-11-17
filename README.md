# Nogal Fase II
Proyecto para Análisis y Diseño de Software 2019-2

## Archivos
En este repositorio se encuentran los archivos que se utilizaron para generar el backend

## Ejecución
Solicitudes:

@PostMapping("/autentificar"): Genera la AuthenticationResponse para iniciar sesión
@PostMapping("/crear"): Crea un usuario al registrarse
@GetMapping("/obtenerID/{token}"): Obtiene el ID del usuario con su token de sesión
@GetMapping("/obtenerUser/{id}"): Obtiene el nombre de usuario a partir del ID
@GetMapping("/obtenerRol/{token}"): Obtiene el rol del usuario (TEC, ADMIN o USER) a partir de su token

@PostMapping("/crearsolicitud"): Crea una solicitud
@GetMapping("/solicitudes/{token}"): Obtiene las solicitudes del usuario autentificado
@GetMapping("/solicitudesAdmin"): Obtiene todas las solicitudes a las que el administrador debe responder
@GetMapping("/asignarTecnicos"): Obtiene las solicitudes a las que el administrador debe asignar un técnico
@PutMapping("/actualizarsolicitud"): Actualiza una solicitud
@DeleteMapping("/eliminar/{id}"): Elimina una solicitud a partir de su id

@PostMapping("/crearTecnico"): Crea un técnico
@GetMapping("/tecnicosEspecialidad/{especialidad}"): Se obtiene todos los tecnicos que tienen su especialidad como {especialidad}
