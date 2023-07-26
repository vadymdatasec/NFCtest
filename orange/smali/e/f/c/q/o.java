public class e.f.c.q.o {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.f.c.h a;
	 public final e.f.c.q.r b;
	 public final e.f.a.b.b.e c;
	 public final e.f.c.r.a d;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/f/c/r/a<", */
	 /* "Le/f/c/v/h;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final e.f.c.r.a e;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/c/r/a<", */
/* "Le/f/c/p/d;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final e.f.c.s.k f;
/* # direct methods */
public e.f.c.q.o ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/c/h;", */
/* "Le/f/c/q/r;", */
/* "Le/f/a/b/b/e;", */
/* "Le/f/c/r/a<", */
/* "Le/f/c/v/h;", */
/* ">;", */
/* "Le/f/c/r/a<", */
/* "Le/f/c/p/d;", */
/* ">;", */
/* "Le/f/c/s/k;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 4 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 5 */
this.a = p1;
/* .line 6 */
this.b = p2;
/* .line 7 */
this.c = p3;
/* .line 8 */
this.d = p4;
/* .line 9 */
this.e = p5;
/* .line 10 */
this.f = p6;
return;
} // .end method
public e.f.c.q.o ( ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/c/h;", */
/* "Le/f/c/q/r;", */
/* "Le/f/c/r/a<", */
/* "Le/f/c/v/h;", */
/* ">;", */
/* "Le/f/c/r/a<", */
/* "Le/f/c/p/d;", */
/* ">;", */
/* "Le/f/c/s/k;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v3, Le/f/a/b/b/e; */
/* .line 2 */
(( e.f.c.h ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/h;->b()Landroid/content/Context;
/* invoke-direct {v3, v0}, Le/f/a/b/b/e;-><init>(Landroid/content/Context;)V */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v4, p3 */
/* move-object v5, p4 */
/* move-object v6, p5 */
/* .line 3 */
/* invoke-direct/range {v0 ..v6}, Le/f/c/q/o;-><init>(Le/f/c/h;Le/f/c/q/r;Le/f/a/b/b/e;Le/f/c/r/a;Le/f/c/r/a;Le/f/c/s/k;)V */
return;
} // .end method
public static java.lang.String a ( Object[] p0 ) {
/* .locals 1 */
/* const/16 v0, 0xb */
/* .line 3 */
android.util.Base64 .encodeToString ( p0,v0 );
} // .end method
public static Boolean a ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = "SERVICE_NOT_AVAILABLE"; // const-string v0, "SERVICE_NOT_AVAILABLE"
/* .line 39 */
v0 = (( java.lang.String ) v0 ).equals ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_1 */
final String v0 = "INTERNAL_SERVER_ERROR"; // const-string v0, "INTERNAL_SERVER_ERROR"
/* .line 40 */
v0 = (( java.lang.String ) v0 ).equals ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_1 */
final String v0 = "InternalServerError"; // const-string v0, "InternalServerError"
/* .line 41 */
p0 = (( java.lang.String ) v0 ).equals ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p0 != null) { // if-eqz p0, :cond_0
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :cond_1
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
} // .end method
/* # virtual methods */
public final android.os.Bundle a ( java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3 ) {
/* .locals 2 */
final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
final String v1 = "scope"; // const-string v1, "scope"
/* .line 6 */
(( android.os.Bundle ) p4 ).putString ( v1, p3 ); // invoke-virtual {p4, v1, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
final String p3 = "sender"; // const-string p3, "sender"
/* .line 7 */
(( android.os.Bundle ) p4 ).putString ( p3, p2 ); // invoke-virtual {p4, p3, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
final String p3 = "subtype"; // const-string p3, "subtype"
/* .line 8 */
(( android.os.Bundle ) p4 ).putString ( p3, p2 ); // invoke-virtual {p4, p3, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
final String p2 = "appid"; // const-string p2, "appid"
/* .line 9 */
(( android.os.Bundle ) p4 ).putString ( p2, p1 ); // invoke-virtual {p4, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 10 */
p1 = this.a;
(( e.f.c.h ) p1 ).d ( ); // invoke-virtual {p1}, Le/f/c/h;->d()Le/f/c/i;
(( e.f.c.i ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/i;->b()Ljava/lang/String;
final String p2 = "gmp_app_id"; // const-string p2, "gmp_app_id"
(( android.os.Bundle ) p4 ).putString ( p2, p1 ); // invoke-virtual {p4, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 11 */
p1 = this.b;
p1 = (( e.f.c.q.r ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/c/q/r;->c()I
java.lang.Integer .toString ( p1 );
final String p2 = "gmsv"; // const-string p2, "gmsv"
(( android.os.Bundle ) p4 ).putString ( p2, p1 ); // invoke-virtual {p4, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 12 */
java.lang.Integer .toString ( p1 );
final String p2 = "osv"; // const-string p2, "osv"
(( android.os.Bundle ) p4 ).putString ( p2, p1 ); // invoke-virtual {p4, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 13 */
p1 = this.b;
(( e.f.c.q.r ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/q/r;->a()Ljava/lang/String;
final String p2 = "app_ver"; // const-string p2, "app_ver"
(( android.os.Bundle ) p4 ).putString ( p2, p1 ); // invoke-virtual {p4, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 14 */
p1 = this.b;
(( e.f.c.q.r ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/q/r;->b()Ljava/lang/String;
final String p2 = "app_ver_name"; // const-string p2, "app_ver_name"
(( android.os.Bundle ) p4 ).putString ( p2, p1 ); // invoke-virtual {p4, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 15 */
(( e.f.c.q.o ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/q/o;->a()Ljava/lang/String;
final String p2 = "firebase-app-name-hash"; // const-string p2, "firebase-app-name-hash"
(( android.os.Bundle ) p4 ).putString ( p2, p1 ); // invoke-virtual {p4, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 16 */
try { // :try_start_0
p1 = this.f;
int p2 = 0; // const/4 p2, 0x0
e.f.a.b.h.n .a ( p1 );
/* check-cast p1, Le/f/c/s/p; */
(( e.f.c.s.p ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/s/p;->a()Ljava/lang/String;
/* .line 17 */
p2 = android.text.TextUtils .isEmpty ( p1 );
/* if-nez p2, :cond_0 */
final String p2 = "Goog-Firebase-Installations-Auth"; // const-string p2, "Goog-Firebase-Installations-Auth"
/* .line 18 */
(( android.os.Bundle ) p4 ).putString ( p2, p1 ); // invoke-virtual {p4, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
} // :cond_0
final String p1 = "FIS auth token is empty"; // const-string p1, "FIS auth token is empty"
/* .line 19 */
android.util.Log .w ( v0,p1 );
/* :try_end_0 */
/* .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* :catch_1 */
/* move-exception p1 */
} // :goto_0
final String p2 = "Failed to get FIS auth token"; // const-string p2, "Failed to get FIS auth token"
/* .line 20 */
android.util.Log .e ( v0,p2,p1 );
} // :goto_1
final String p1 = "21.0.0"; // const-string p1, "21.0.0"
final String p2 = "fiid-"; // const-string p2, "fiid-"
/* .line 21 */
p3 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
if ( p3 != null) { // if-eqz p3, :cond_1
(( java.lang.String ) p2 ).concat ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :cond_1
/* new-instance p1, Ljava/lang/String; */
/* invoke-direct {p1, p2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
} // :goto_2
final String p2 = "cliv"; // const-string p2, "cliv"
(( android.os.Bundle ) p4 ).putString ( p2, p1 ); // invoke-virtual {p4, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 22 */
p1 = this.e;
/* check-cast p1, Le/f/c/p/d; */
/* .line 23 */
p2 = this.d;
/* check-cast p2, Le/f/c/v/h; */
if ( p1 != null) { // if-eqz p1, :cond_2
if ( p2 != null) { // if-eqz p2, :cond_2
final String p3 = "fire-iid"; // const-string p3, "fire-iid"
/* .line 24 */
/* .line 25 */
p3 = e.f.c.p.c.c;
/* if-eq p1, p3, :cond_2 */
/* .line 26 */
p1 = (( e.f.c.p.c ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/p/c;->a()I
java.lang.Integer .toString ( p1 );
final String p3 = "Firebase-Client-Log-Type"; // const-string p3, "Firebase-Client-Log-Type"
(( android.os.Bundle ) p4 ).putString ( p3, p1 ); // invoke-virtual {p4, p3, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 27 */
final String p2 = "Firebase-Client"; // const-string p2, "Firebase-Client"
(( android.os.Bundle ) p4 ).putString ( p2, p1 ); // invoke-virtual {p4, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
} // :cond_2
} // .end method
public final e.f.a.b.h.g a ( Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/a/b/h/g<", */
/* "Landroid/os/Bundle;", */
/* ">;)", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 37 */
e.f.c.q.h .a ( );
/* new-instance v1, Le/f/c/q/n; */
/* invoke-direct {v1, p0}, Le/f/c/q/n;-><init>(Le/f/c/q/o;)V */
/* .line 38 */
(( e.f.a.b.h.g ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;
} // .end method
public e.f.a.b.h.g a ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
(( e.f.c.q.o ) p0 ).b ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Le/f/c/q/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Le/f/a/b/h/g;
/* .line 2 */
(( e.f.c.q.o ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/q/o;->a(Le/f/a/b/h/g;)Le/f/a/b/h/g;
} // .end method
public final java.lang.String a ( ) {
/* .locals 2 */
/* .line 4 */
v0 = this.a;
(( e.f.c.h ) v0 ).c ( ); // invoke-virtual {v0}, Le/f/c/h;->c()Ljava/lang/String;
final String v1 = "SHA-1"; // const-string v1, "SHA-1"
/* .line 5 */
try { // :try_start_0
java.security.MessageDigest .getInstance ( v1 );
(( java.lang.String ) v0 ).getBytes ( ); // invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
(( java.security.MessageDigest ) v1 ).digest ( v0 ); // invoke-virtual {v1, v0}, Ljava/security/MessageDigest;->digest([B)[B
e.f.c.q.o .a ( v0 );
/* :try_end_0 */
/* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
final String v0 = "[HASH-ERROR]"; // const-string v0, "[HASH-ERROR]"
} // .end method
public final java.lang.String a ( android.os.Bundle p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
final String v0 = "SERVICE_NOT_AVAILABLE"; // const-string v0, "SERVICE_NOT_AVAILABLE"
if ( p1 != null) { // if-eqz p1, :cond_4
final String v1 = "registration_id"; // const-string v1, "registration_id"
/* .line 28 */
(( android.os.Bundle ) p1 ).getString ( v1 ); // invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_0
final String v1 = "unregistered"; // const-string v1, "unregistered"
/* .line 29 */
(( android.os.Bundle ) p1 ).getString ( v1 ); // invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_1
} // :cond_1
final String v1 = "error"; // const-string v1, "error"
/* .line 30 */
(( android.os.Bundle ) p1 ).getString ( v1 ); // invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
final String v2 = "RST"; // const-string v2, "RST"
/* .line 31 */
v2 = (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_3 */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 32 */
/* new-instance p1, Ljava/io/IOException; */
/* invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 33 */
} // :cond_2
java.lang.String .valueOf ( p1 );
java.lang.String .valueOf ( p1 );
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* add-int/lit8 v1, v1, 0x15 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v1 = "Unexpected response: "; // const-string v1, "Unexpected response: "
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v1, Ljava/lang/Throwable; */
/* invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V */
final String v2 = "FirebaseInstanceId"; // const-string v2, "FirebaseInstanceId"
android.util.Log .w ( v2,p1,v1 );
/* .line 34 */
/* new-instance p1, Ljava/io/IOException; */
/* invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 35 */
} // :cond_3
/* new-instance p1, Ljava/io/IOException; */
final String v0 = "INSTANCE_ID_RESET"; // const-string v0, "INSTANCE_ID_RESET"
/* invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 36 */
} // :cond_4
/* new-instance p1, Ljava/io/IOException; */
/* invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public e.f.a.b.h.g b ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Le/f/a/b/h/g<", */
/* "*>;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 2 */
java.lang.String .valueOf ( p3 );
v2 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
final String v3 = "/topics/"; // const-string v3, "/topics/"
if ( v2 != null) { // if-eqz v2, :cond_0
(( java.lang.String ) v3 ).concat ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :cond_0
/* new-instance v1, Ljava/lang/String; */
/* invoke-direct {v1, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
} // :goto_0
final String v2 = "gcm.topic"; // const-string v2, "gcm.topic"
(( android.os.Bundle ) v0 ).putString ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 3 */
java.lang.String .valueOf ( p3 );
v1 = (( java.lang.String ) p3 ).length ( ); // invoke-virtual {p3}, Ljava/lang/String;->length()I
if ( v1 != null) { // if-eqz v1, :cond_1
(( java.lang.String ) v3 ).concat ( p3 ); // invoke-virtual {v3, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :cond_1
/* new-instance p3, Ljava/lang/String; */
/* invoke-direct {p3, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
/* .line 4 */
} // :goto_1
(( e.f.c.q.o ) p0 ).b ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Le/f/c/q/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Le/f/a/b/h/g;
/* .line 5 */
(( e.f.c.q.o ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/q/o;->a(Le/f/a/b/h/g;)Le/f/a/b/h/g;
} // .end method
public final e.f.a.b.h.g b ( java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Landroid/os/Bundle;", */
/* ")", */
/* "Le/f/a/b/h/g<", */
/* "Landroid/os/Bundle;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 6 */
(( e.f.c.q.o ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Le/f/c/q/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
/* .line 7 */
p1 = this.c;
(( e.f.a.b.b.e ) p1 ).a ( p4 ); // invoke-virtual {p1, p4}, Le/f/a/b/b/e;->a(Landroid/os/Bundle;)Le/f/a/b/h/g;
} // .end method
public final java.lang.String b ( Object p0 ) { //synthethic
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 8 */
/* const-class v0, Ljava/io/IOException; */
(( e.f.a.b.h.g ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/a/b/h/g;->a(Ljava/lang/Class;)Ljava/lang/Object;
/* check-cast p1, Landroid/os/Bundle; */
(( e.f.c.q.o ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/q/o;->a(Landroid/os/Bundle;)Ljava/lang/String;
} // .end method
public e.f.a.b.h.g c ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Le/f/a/b/h/g<", */
/* "*>;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 2 */
java.lang.String .valueOf ( p3 );
v2 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
final String v3 = "/topics/"; // const-string v3, "/topics/"
if ( v2 != null) { // if-eqz v2, :cond_0
(( java.lang.String ) v3 ).concat ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :cond_0
/* new-instance v1, Ljava/lang/String; */
/* invoke-direct {v1, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
} // :goto_0
final String v2 = "gcm.topic"; // const-string v2, "gcm.topic"
(( android.os.Bundle ) v0 ).putString ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
final String v1 = "delete"; // const-string v1, "delete"
final String v2 = "1"; // const-string v2, "1"
/* .line 3 */
(( android.os.Bundle ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 4 */
java.lang.String .valueOf ( p3 );
v1 = (( java.lang.String ) p3 ).length ( ); // invoke-virtual {p3}, Ljava/lang/String;->length()I
if ( v1 != null) { // if-eqz v1, :cond_1
(( java.lang.String ) v3 ).concat ( p3 ); // invoke-virtual {v3, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :cond_1
/* new-instance p3, Ljava/lang/String; */
/* invoke-direct {p3, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
/* .line 5 */
} // :goto_1
(( e.f.c.q.o ) p0 ).b ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Le/f/c/q/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Le/f/a/b/h/g;
/* .line 6 */
(( e.f.c.q.o ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/q/o;->a(Le/f/a/b/h/g;)Le/f/a/b/h/g;
} // .end method
