public abstract class e.f.a.d.a.d.c.a {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.Map a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/Integer;", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static final java.util.Map b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/Integer;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.f.a.d.a.d.c.a ( ) {
/* .locals 12 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
v0 = e.f.a.d.a.d.c.a.a;
int v1 = -2; // const/4 v1, -0x2
java.lang.Integer .valueOf ( v1 );
final String v2 = "An unknown error occurred."; // const-string v2, "An unknown error occurred."
v0 = e.f.a.d.a.d.c.a.a;
int v2 = -3; // const/4 v2, -0x3
java.lang.Integer .valueOf ( v2 );
final String v3 = "The API is not available on this device."; // const-string v3, "The API is not available on this device."
v0 = e.f.a.d.a.d.c.a.a;
int v3 = -4; // const/4 v3, -0x4
java.lang.Integer .valueOf ( v3 );
final String v4 = "The request that was sent by the app is malformed."; // const-string v4, "The request that was sent by the app is malformed."
v0 = e.f.a.d.a.d.c.a.a;
int v4 = -5; // const/4 v4, -0x5
java.lang.Integer .valueOf ( v4 );
final String v5 = "The install is unavailable to this user or device."; // const-string v5, "The install is unavailable to this user or device."
v0 = e.f.a.d.a.d.c.a.a;
int v5 = -6; // const/4 v5, -0x6
java.lang.Integer .valueOf ( v5 );
final String v6 = "The download/install is not allowed, due to the current device state (e.g.low battery, low disk space, ...)."; // const-string v6, "The download/install is not allowed, due to the current device state (e.g.low battery, low disk space, ...)."
v0 = e.f.a.d.a.d.c.a.a;
int v6 = -7; // const/4 v6, -0x7
java.lang.Integer .valueOf ( v6 );
final String v7 = "The install/update has not been (fully) downloaded yet."; // const-string v7, "The install/update has not been (fully) downloaded yet."
v0 = e.f.a.d.a.d.c.a.a;
int v7 = -8; // const/4 v7, -0x8
java.lang.Integer .valueOf ( v7 );
final String v8 = "The install is already in progress and there is no UI flow to resume."; // const-string v8, "The install is already in progress and there is no UI flow to resume."
v0 = e.f.a.d.a.d.c.a.a;
/* const/16 v8, -0x9 */
java.lang.Integer .valueOf ( v8 );
final String v9 = "The Play Store app is either not installed or not the official version."; // const-string v9, "The Play Store app is either not installed or not the official version."
v0 = e.f.a.d.a.d.c.a.a;
/* const/16 v9, -0xa */
java.lang.Integer .valueOf ( v9 );
final String v10 = "The app is not owned by any user on this device.An app is \"owned\" if it has been acquired from Play."; // const-string v10, "The app is not owned by any user on this device.An app is \"owned\" if it has been acquired from Play."
v0 = e.f.a.d.a.d.c.a.a;
/* const/16 v10, -0x64 */
java.lang.Integer .valueOf ( v10 );
final String v11 = "An internal error happened in the Play Store."; // const-string v11, "An internal error happened in the Play Store."
v0 = e.f.a.d.a.d.c.a.b;
final String v11 = "ERROR_UNKNOWN"; // const-string v11, "ERROR_UNKNOWN"
v0 = e.f.a.d.a.d.c.a.b;
final String v1 = "ERROR_API_NOT_AVAILABLE"; // const-string v1, "ERROR_API_NOT_AVAILABLE"
v0 = e.f.a.d.a.d.c.a.b;
final String v1 = "ERROR_INVALID_REQUEST"; // const-string v1, "ERROR_INVALID_REQUEST"
v0 = e.f.a.d.a.d.c.a.b;
final String v1 = "ERROR_INSTALL_UNAVAILABLE"; // const-string v1, "ERROR_INSTALL_UNAVAILABLE"
v0 = e.f.a.d.a.d.c.a.b;
final String v1 = "ERROR_INSTALL_NOT_ALLOWED"; // const-string v1, "ERROR_INSTALL_NOT_ALLOWED"
v0 = e.f.a.d.a.d.c.a.b;
final String v1 = "ERROR_DOWNLOAD_NOT_PRESENT"; // const-string v1, "ERROR_DOWNLOAD_NOT_PRESENT"
v0 = e.f.a.d.a.d.c.a.b;
final String v1 = "ERROR_INSTALL_IN_PROGRESS"; // const-string v1, "ERROR_INSTALL_IN_PROGRESS"
v0 = e.f.a.d.a.d.c.a.b;
final String v1 = "ERROR_INTERNAL_ERROR"; // const-string v1, "ERROR_INTERNAL_ERROR"
v0 = e.f.a.d.a.d.c.a.b;
final String v1 = "ERROR_PLAY_STORE_NOT_FOUND"; // const-string v1, "ERROR_PLAY_STORE_NOT_FOUND"
v0 = e.f.a.d.a.d.c.a.b;
final String v1 = "ERROR_APP_NOT_OWNED"; // const-string v1, "ERROR_APP_NOT_OWNED"
return;
} // .end method
public static java.lang.String a ( Integer p0 ) {
/* .locals 4 */
v0 = e.f.a.d.a.d.c.a.a;
v0 = java.lang.Integer .valueOf ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = v0 = e.f.a.d.a.d.c.a.b;
/* if-nez v0, :cond_0 */
} // :cond_0
v0 = e.f.a.d.a.d.c.a.a;
/* check-cast v0, Ljava/lang/String; */
v1 = e.f.a.d.a.d.c.a.b;
/* check-cast p0, Ljava/lang/String; */
java.lang.String .valueOf ( v0 );
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
java.lang.String .valueOf ( p0 );
v2 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* new-instance v3, Ljava/lang/StringBuilder; */
/* add-int/lit8 v1, v1, 0x67 */
/* add-int/2addr v1, v2 */
/* invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = " ("; // const-string v0, " ("
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode"; // const-string v0, "https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode"
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "#"; // const-string v0, "#"
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p0 ); // invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p0 = ")"; // const-string p0, ")"
(( java.lang.StringBuilder ) v3 ).append ( p0 ); // invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_1
} // :goto_0
final String p0 = ""; // const-string p0, ""
} // .end method
