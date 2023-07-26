public class inal extends e.f.a.b.c.m.j.a {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final android.os.Parcelable$Creator CREATOR;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/os/Parcelable$Creator<", */
	 /* "Le/f/a/b/c/a;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static final e.f.a.b.c.a f;
/* # instance fields */
public final Integer b;
public final Integer c;
public final android.app.PendingIntent d;
public final java.lang.String e;
/* # direct methods */
public static inal ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Le/f/a/b/c/a; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1}, Le/f/a/b/c/a;-><init>(I)V */
/* .line 2 */
/* new-instance v0, Le/f/a/b/c/r; */
/* invoke-direct {v0}, Le/f/a/b/c/r;-><init>()V */
return;
} // .end method
public inal ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
/* invoke-direct {p0, p1, v0, v0}, Le/f/a/b/c/a;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V */
return;
} // .end method
public inal ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Le/f/a/b/c/m/j/a;-><init>()V */
/* .line 2 */
/* iput p1, p0, Le/f/a/b/c/a;->b:I */
/* .line 3 */
/* iput p2, p0, Le/f/a/b/c/a;->c:I */
/* .line 4 */
this.d = p3;
/* .line 5 */
this.e = p4;
return;
} // .end method
public inal ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 7 */
/* invoke-direct {p0, p1, p2, v0}, Le/f/a/b/c/a;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V */
return;
} // .end method
public inal ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 8 */
/* invoke-direct {p0, v0, p1, p2, p3}, Le/f/a/b/c/a;-><init>(IILandroid/app/PendingIntent;Ljava/lang/String;)V */
return;
} // .end method
public static java.lang.String a ( Integer p0 ) {
/* .locals 2 */
/* const/16 v0, 0x63 */
/* if-eq p0, v0, :cond_1 */
/* const/16 v0, 0x5dc */
/* if-eq p0, v0, :cond_0 */
/* packed-switch p0, :pswitch_data_0 */
/* packed-switch p0, :pswitch_data_1 */
/* const/16 v0, 0x1f */
/* .line 2 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v0 = "UNKNOWN_ERROR_CODE("; // const-string v0, "UNKNOWN_ERROR_CODE("
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p0 = ")"; // const-string p0, ")"
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* :pswitch_0 */
final String p0 = "API_VERSION_UPDATE_REQUIRED"; // const-string p0, "API_VERSION_UPDATE_REQUIRED"
/* :pswitch_1 */
final String p0 = "RESTRICTED_PROFILE"; // const-string p0, "RESTRICTED_PROFILE"
/* :pswitch_2 */
final String p0 = "SERVICE_MISSING_PERMISSION"; // const-string p0, "SERVICE_MISSING_PERMISSION"
/* :pswitch_3 */
final String p0 = "SERVICE_UPDATING"; // const-string p0, "SERVICE_UPDATING"
/* :pswitch_4 */
final String p0 = "SIGN_IN_FAILED"; // const-string p0, "SIGN_IN_FAILED"
/* :pswitch_5 */
final String p0 = "API_UNAVAILABLE"; // const-string p0, "API_UNAVAILABLE"
/* :pswitch_6 */
final String p0 = "INTERRUPTED"; // const-string p0, "INTERRUPTED"
/* :pswitch_7 */
final String p0 = "TIMEOUT"; // const-string p0, "TIMEOUT"
/* :pswitch_8 */
final String p0 = "CANCELED"; // const-string p0, "CANCELED"
/* :pswitch_9 */
final String p0 = "LICENSE_CHECK_FAILED"; // const-string p0, "LICENSE_CHECK_FAILED"
/* :pswitch_a */
final String p0 = "DEVELOPER_ERROR"; // const-string p0, "DEVELOPER_ERROR"
/* :pswitch_b */
final String p0 = "SERVICE_INVALID"; // const-string p0, "SERVICE_INVALID"
/* :pswitch_c */
final String p0 = "INTERNAL_ERROR"; // const-string p0, "INTERNAL_ERROR"
/* :pswitch_d */
final String p0 = "NETWORK_ERROR"; // const-string p0, "NETWORK_ERROR"
/* :pswitch_e */
final String p0 = "RESOLUTION_REQUIRED"; // const-string p0, "RESOLUTION_REQUIRED"
/* :pswitch_f */
final String p0 = "INVALID_ACCOUNT"; // const-string p0, "INVALID_ACCOUNT"
/* :pswitch_10 */
final String p0 = "SIGN_IN_REQUIRED"; // const-string p0, "SIGN_IN_REQUIRED"
/* :pswitch_11 */
final String p0 = "SERVICE_DISABLED"; // const-string p0, "SERVICE_DISABLED"
/* :pswitch_12 */
final String p0 = "SERVICE_VERSION_UPDATE_REQUIRED"; // const-string p0, "SERVICE_VERSION_UPDATE_REQUIRED"
/* :pswitch_13 */
final String p0 = "SERVICE_MISSING"; // const-string p0, "SERVICE_MISSING"
/* :pswitch_14 */
final String p0 = "SUCCESS"; // const-string p0, "SUCCESS"
/* :pswitch_15 */
final String p0 = "UNKNOWN"; // const-string p0, "UNKNOWN"
} // :cond_0
final String p0 = "DRIVE_EXTERNAL_STORAGE_REQUIRED"; // const-string p0, "DRIVE_EXTERNAL_STORAGE_REQUIRED"
} // :cond_1
final String p0 = "UNFINISHED"; // const-string p0, "UNFINISHED"
/* nop */
/* :pswitch_data_0 */
/* .packed-switch -0x1 */
/* :pswitch_15 */
/* :pswitch_14 */
/* :pswitch_13 */
/* :pswitch_12 */
/* :pswitch_11 */
/* :pswitch_10 */
/* :pswitch_f */
/* :pswitch_e */
/* :pswitch_d */
/* :pswitch_c */
/* :pswitch_b */
/* :pswitch_a */
/* :pswitch_9 */
} // .end packed-switch
/* :pswitch_data_1 */
/* .packed-switch 0xd */
/* :pswitch_8 */
/* :pswitch_7 */
/* :pswitch_6 */
/* :pswitch_5 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
/* # virtual methods */
public final Integer a ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/f/a/b/c/a;->c:I */
} // .end method
public final java.lang.String b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
} // .end method
public final android.app.PendingIntent c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public final Boolean d ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/f/a/b/c/a;->c:I */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final Boolean e ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/f/a/b/c/a;->c:I */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final Boolean equals ( java.lang.Object p0 ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, p0, :cond_0 */
/* .line 1 */
} // :cond_0
/* instance-of v1, p1, Le/f/a/b/c/a; */
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_1 */
/* .line 2 */
} // :cond_1
/* check-cast p1, Le/f/a/b/c/a; */
/* .line 3 */
/* iget v1, p0, Le/f/a/b/c/a;->c:I */
/* iget v3, p1, Le/f/a/b/c/a;->c:I */
/* if-ne v1, v3, :cond_2 */
v1 = this.d;
v3 = this.d;
/* .line 4 */
v1 = e.f.a.b.c.m.g .a ( v1,v3 );
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = this.e;
p1 = this.e;
/* .line 5 */
p1 = e.f.a.b.c.m.g .a ( v1,p1 );
if ( p1 != null) { // if-eqz p1, :cond_2
} // :cond_2
} // .end method
public final Integer hashCode ( ) {
/* .locals 3 */
int v0 = 3; // const/4 v0, 0x3
/* new-array v0, v0, [Ljava/lang/Object; */
/* .line 1 */
/* iget v1, p0, Le/f/a/b/c/a;->c:I */
java.lang.Integer .valueOf ( v1 );
int v2 = 0; // const/4 v2, 0x0
/* aput-object v1, v0, v2 */
v1 = this.d;
int v2 = 1; // const/4 v2, 0x1
/* aput-object v1, v0, v2 */
v1 = this.e;
int v2 = 2; // const/4 v2, 0x2
/* aput-object v1, v0, v2 */
v0 = e.f.a.b.c.m.g .a ( v0 );
} // .end method
public final java.lang.String toString ( ) {
/* .locals 3 */
/* .line 1 */
e.f.a.b.c.m.g .a ( p0 );
/* iget v1, p0, Le/f/a/b/c/a;->c:I */
/* .line 2 */
e.f.a.b.c.a .a ( v1 );
final String v2 = "statusCode"; // const-string v2, "statusCode"
(( e.f.a.b.c.m.f ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/a/b/c/m/f;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/a/b/c/m/f;
v1 = this.d;
final String v2 = "resolution"; // const-string v2, "resolution"
/* .line 3 */
(( e.f.a.b.c.m.f ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/a/b/c/m/f;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/a/b/c/m/f;
v1 = this.e;
final String v2 = "message"; // const-string v2, "message"
/* .line 4 */
(( e.f.a.b.c.m.f ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/a/b/c/m/f;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/a/b/c/m/f;
/* .line 5 */
(( e.f.a.b.c.m.f ) v0 ).toString ( ); // invoke-virtual {v0}, Le/f/a/b/c/m/f;->toString()Ljava/lang/String;
} // .end method
public final void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 4 */
/* .line 1 */
v0 = e.f.a.b.c.m.j.b .a ( p1 );
/* .line 2 */
/* iget v1, p0, Le/f/a/b/c/a;->b:I */
int v2 = 1; // const/4 v2, 0x1
e.f.a.b.c.m.j.b .a ( p1,v2,v1 );
/* .line 3 */
v1 = (( e.f.a.b.c.a ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/b/c/a;->a()I
int v2 = 2; // const/4 v2, 0x2
/* .line 4 */
e.f.a.b.c.m.j.b .a ( p1,v2,v1 );
/* .line 5 */
(( e.f.a.b.c.a ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/b/c/a;->c()Landroid/app/PendingIntent;
int v2 = 0; // const/4 v2, 0x0
int v3 = 3; // const/4 v3, 0x3
/* .line 6 */
e.f.a.b.c.m.j.b .a ( p1,v3,v1,p2,v2 );
/* .line 7 */
(( e.f.a.b.c.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/b/c/a;->b()Ljava/lang/String;
int v1 = 4; // const/4 v1, 0x4
/* .line 8 */
e.f.a.b.c.m.j.b .a ( p1,v1,p2,v2 );
/* .line 9 */
e.f.a.b.c.m.j.b .a ( p1,v0 );
return;
} // .end method
