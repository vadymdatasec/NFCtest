public class com.orange.oab.contactless.packid.service.LogManager {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Integer GATT_LEVEL;
	 public static final java.lang.String MESSAGE_ACTION;
	 public static final java.lang.String MESSAGE_COLOR;
	 public static final java.lang.String MESSAGE_EXTRA;
	 public static final java.lang.String MESSAGE_TIME_STAMP;
	 public static final java.lang.String SHOULD_WRITE;
	 public static final java.lang.String TAG;
	 public static final Integer TRANSACTION_LEVEL;
	 public static final java.lang.String a;
	 public static final Integer b;
	 public static final Integer c;
	 public static final Integer d;
	 public static java.util.Date e;
	 /* # direct methods */
	 public static com.orange.oab.contactless.packid.service.LogManager ( ) {
		 /* .locals 3 */
		 final String v0 = "android.permission.READ_EXTERNAL_STORAGE"; // const-string v0, "android.permission.READ_EXTERNAL_STORAGE"
		 final String v1 = "android.permission.WRITE_EXTERNAL_STORAGE"; // const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"
		 /* .line 1 */
		 /* filled-new-array {v0, v1}, [Ljava/lang/String; */
		 /* const/16 v0, 0x87 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const/16 v2, 0x57 */
		 /* .line 2 */
		 v2 = 		 android.graphics.Color .rgb ( v1,v2,v0 );
		 /* const/16 v2, 0x21 */
		 /* .line 3 */
		 v0 = 		 android.graphics.Color .rgb ( v1,v0,v2 );
		 /* const/16 v0, 0xe8 */
		 /* const/16 v1, 0xa5 */
		 /* const/16 v2, 0x40 */
		 /* .line 4 */
		 v0 = 		 android.graphics.Color .rgb ( v0,v1,v2 );
		 return;
	 } // .end method
	 public static Integer a ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 /* const/high16 v0, -0x1000000 */
		 /* if-ne p0, v0, :cond_2 */
		 /* if-nez p1, :cond_0 */
	 } // :cond_0
	 int p0 = 1; // const/4 p0, 0x1
	 /* if-ne p1, p0, :cond_1 */
	 /* .line 14 */
} // :cond_1
} // :goto_0
} // :cond_2
} // .end method
public static java.lang.String a ( Integer p0, java.util.Date p1 ) {
/* .locals 5 */
/* if-lez p0, :cond_1 */
/* .line 15 */
/* new-instance p0, Ljava/lang/StringBuilder; */
/* invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V */
/* new-instance v0, Ljava/text/DecimalFormat; */
final String v1 = "0000"; // const-string v1, "0000"
/* invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V */
v1 = com.orange.oab.contactless.packid.service.LogManager.e;
/* if-nez v1, :cond_0 */
/* const-wide/16 v1, 0x0 */
} // :cond_0
(( java.util.Date ) p1 ).getTime ( ); // invoke-virtual {p1}, Ljava/util/Date;->getTime()J
/* move-result-wide v1 */
p1 = com.orange.oab.contactless.packid.service.LogManager.e;
(( java.util.Date ) p1 ).getTime ( ); // invoke-virtual {p1}, Ljava/util/Date;->getTime()J
/* move-result-wide v3 */
/* sub-long/2addr v1, v3 */
} // :goto_0
(( java.text.DecimalFormat ) v0 ).format ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;
(( java.lang.StringBuilder ) p0 ).append ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " ms"; // const-string p1, " ms"
(( java.lang.StringBuilder ) p0 ).append ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_1
final String p0 = " -- "; // const-string p0, " -- "
} // .end method
public static void a ( android.content.Context p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
e.h.a.a.a.a.b .c ( p0,v0 );
/* .line 2 */
/* new-instance v0, Le/h/d/a/a/w/j; */
/* invoke-direct {v0, p0}, Le/h/d/a/a/w/j;-><init>(Landroid/content/Context;)V */
/* .line 3 */
(( e.h.d.a.a.w.j ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/w/j;->a()V
return;
} // .end method
public static void a ( android.content.Context p0, Object p1 ) {
/* .locals 3 */
/* .line 6 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/service/LogManager$a; */
/* new-instance v1, Landroid/os/Handler; */
android.os.Looper .getMainLooper ( );
/* invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
/* invoke-direct {v0, v1, p1}, Lcom/orange/oab/contactless/packid/service/LogManager$a;-><init>(Landroid/os/Handler;Le/h/d/a/a/w/n;)V */
/* .line 7 */
/* new-instance p1, Landroid/content/Intent; */
/* const-class v1, Lcom/orange/oab/contactless/packid/permissions/PermissionActivity; */
/* invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
final String v1 = "result_receiver"; // const-string v1, "result_receiver"
/* .line 8 */
(( android.content.Intent ) p1 ).putExtra ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
/* .line 9 */
v0 = com.orange.oab.contactless.packid.service.LogManager.a;
final String v1 = "permissions_array"; // const-string v1, "permissions_array"
(( android.content.Intent ) p1 ).putExtra ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;
final String v0 = "request_code"; // const-string v0, "request_code"
/* const v1, 0x1e315 */
/* .line 10 */
(( android.content.Intent ) p1 ).putExtra ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
/* .line 11 */
(( android.content.Context ) p0 ).startActivity ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
return;
} // .end method
public static void a ( Object p0, java.lang.String p1, android.content.Context p2, Boolean p3 ) { //synthethic
/* .locals 0 */
/* .line 4 */
(( e.h.d.a.a.w.j ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Le/h/d/a/a/w/j;->a(Ljava/lang/String;Landroid/content/Context;Z)V
int p0 = 0; // const/4 p0, 0x0
/* const/high16 p3, -0x1000000 */
/* .line 5 */
com.orange.oab.contactless.packid.service.LogManager .log ( p2,p3,p1,p0,p0 );
return;
} // .end method
public static Boolean a ( java.io.File p0 ) {
/* .locals 4 */
/* .line 12 */
(( java.io.File ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/io/File;->length()J
/* move-result-wide v0 */
/* const-wide/16 v2, 0x400 */
/* .line 13 */
/* div-long/2addr v0, v2 */
/* div-long/2addr v0, v2 */
/* const-wide/16 v2, 0x1 */
/* cmp-long p0, v0, v2 */
/* if-ltz p0, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static java.lang.String b ( Integer p0, java.util.Date p1 ) {
/* .locals 3 */
/* .line 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* new-instance v1, Ljava/text/SimpleDateFormat; */
final String v2 = "HH:mm:ss.SSS"; // const-string v2, "HH:mm:ss.SSS"
/* invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V */
(( java.text.SimpleDateFormat ) v1 ).format ( p1 ); // invoke-virtual {v1, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " ["; // const-string v1, " ["
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.orange.oab.contactless.packid.service.LogManager .a ( p0,p1 );
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "] "; // const-string p1, "] "
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
int p1 = 1; // const/4 p1, 0x1
/* if-lt p0, p1, :cond_0 */
/* sub-int/2addr p0, p1 */
final String p1 = " > "; // const-string p1, " > "
e.f.b.a.q .a ( p1,p0 );
} // :cond_0
final String p0 = ""; // const-string p0, ""
} // :goto_0
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static void b ( android.content.Context p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
com.orange.oab.contactless.packid.service.LogManager .a ( p0 );
return;
} // .end method
public static void e ( android.content.Context p0, java.lang.String p1, Integer p2 ) {
/* .locals 1 */
/* const/high16 v0, -0x10000 */
/* .line 1 */
com.orange.oab.contactless.packid.service.LogManager .log ( p0,v0,p1,p2 );
return;
} // .end method
public static void log ( android.content.Context p0, Integer p1, java.lang.String p2, Integer p3 ) {
/* .locals 3 */
/* .line 3 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "LogService"; // const-string v1, "LogService"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 4 */
/* new-instance v1, Ljava/util/Date; */
/* invoke-direct {v1}, Ljava/util/Date;-><init>()V */
/* .line 5 */
com.orange.oab.contactless.packid.service.LogManager .b ( p3,v1 );
final String v2 = "LogServiceTimeStamp"; // const-string v2, "LogServiceTimeStamp"
(( android.content.Intent ) v0 ).putExtra ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
final String v1 = "LogServiceMessage"; // const-string v1, "LogServiceMessage"
/* .line 6 */
(( android.content.Intent ) v0 ).putExtra ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 7 */
p1 = com.orange.oab.contactless.packid.service.LogManager .a ( p1,p3 );
final String p2 = "LogServiceColor"; // const-string p2, "LogServiceColor"
(( android.content.Intent ) v0 ).putExtra ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
final String p1 = "LogServiceShouldWrite"; // const-string p1, "LogServiceShouldWrite"
int p2 = 1; // const/4 p2, 0x1
/* .line 8 */
(( android.content.Intent ) v0 ).putExtra ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
/* .line 9 */
c.p.a.d .a ( p0 );
(( c.p.a.d ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/p/a/d;->a(Landroid/content/Intent;)Z
return;
} // .end method
public static void log ( android.content.Context p0, Integer p1, java.lang.String p2, Integer p3, Boolean p4 ) {
/* .locals 3 */
/* .line 10 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "LogService"; // const-string v1, "LogService"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 11 */
/* new-instance v1, Ljava/util/Date; */
/* invoke-direct {v1}, Ljava/util/Date;-><init>()V */
/* .line 12 */
com.orange.oab.contactless.packid.service.LogManager .b ( p3,v1 );
final String v2 = "LogServiceTimeStamp"; // const-string v2, "LogServiceTimeStamp"
(( android.content.Intent ) v0 ).putExtra ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
final String v1 = "LogServiceMessage"; // const-string v1, "LogServiceMessage"
/* .line 13 */
(( android.content.Intent ) v0 ).putExtra ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 14 */
p1 = com.orange.oab.contactless.packid.service.LogManager .a ( p1,p3 );
final String p2 = "LogServiceColor"; // const-string p2, "LogServiceColor"
(( android.content.Intent ) v0 ).putExtra ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
final String p1 = "LogServiceShouldWrite"; // const-string p1, "LogServiceShouldWrite"
/* .line 15 */
(( android.content.Intent ) v0 ).putExtra ( p1, p4 ); // invoke-virtual {v0, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
/* .line 16 */
c.p.a.d .a ( p0 );
(( c.p.a.d ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/p/a/d;->a(Landroid/content/Intent;)Z
return;
} // .end method
public static void log ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
com.orange.oab.contactless.packid.service.LogManager .log ( p0,p1,v0 );
return;
} // .end method
public static void log ( android.content.Context p0, java.lang.String p1, Integer p2 ) {
/* .locals 1 */
/* const/high16 v0, -0x1000000 */
/* .line 2 */
com.orange.oab.contactless.packid.service.LogManager .log ( p0,v0,p1,p2 );
return;
} // .end method
public static void start ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/util/Date; */
/* invoke-direct {v0}, Ljava/util/Date;-><init>()V */
/* .line 2 */
com.orange.oab.contactless.packid.service.LogManager .log ( p0,p1 );
return;
} // .end method
public static void startPersistentLog ( android.content.Context p0, java.lang.Boolean p1 ) {
/* .locals 2 */
final String v0 = "LogManager"; // const-string v0, "LogManager"
final String v1 = "Start Persistent Log"; // const-string v1, "Start Persistent Log"
/* .line 1 */
android.util.Log .d ( v0,v1 );
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
e.h.a.a.a.a.b .c ( p0,v0 );
final String v0 = "android.permission.WRITE_EXTERNAL_STORAGE"; // const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"
/* .line 3 */
v0 = c.h.f.f .a ( p0,v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
/* new-instance p1, Le/h/d/a/a/w/c; */
/* invoke-direct {p1, p0}, Le/h/d/a/a/w/c;-><init>(Landroid/content/Context;)V */
com.orange.oab.contactless.packid.service.LogManager .a ( p0,p1 );
/* .line 5 */
} // :cond_0
/* new-instance v0, Le/h/d/a/a/w/j; */
/* invoke-direct {v0, p0}, Le/h/d/a/a/w/j;-><init>(Landroid/content/Context;)V */
/* .line 6 */
p1 = (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
/* if-nez p1, :cond_1 */
(( e.h.d.a.a.w.j ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Le/h/d/a/a/w/j;->a(Landroid/content/Context;)Ljava/io/File;
/* if-nez p1, :cond_2 */
/* .line 7 */
} // :cond_1
com.orange.oab.contactless.packid.service.LogManager .a ( p0 );
} // :cond_2
} // :goto_0
return;
} // .end method
public static void stopPersistentLogs ( android.content.Context p0 ) {
/* .locals 2 */
final String v0 = "LogManager"; // const-string v0, "LogManager"
final String v1 = "Stop Persistent Log"; // const-string v1, "Stop Persistent Log"
/* .line 1 */
android.util.Log .d ( v0,v1 );
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
e.h.a.a.a.a.b .c ( p0,v0 );
return;
} // .end method
public static void w ( android.content.Context p0, java.lang.String p1, Integer p2 ) {
/* .locals 1 */
/* .line 1 */
com.orange.oab.contactless.packid.service.LogManager .log ( p0,v0,p1,p2 );
return;
} // .end method
public static void writeToPersistentLog ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
com.orange.oab.contactless.packid.service.LogManager .writeToPersistentLog ( p0,p1,v0 );
return;
} // .end method
public static void writeToPersistentLog ( android.content.Context p0, java.lang.String p1, Boolean p2 ) {
/* .locals 2 */
/* .line 2 */
v0 = e.h.a.a.a.a.b .c ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 3 */
/* new-instance v0, Le/h/d/a/a/w/j; */
/* invoke-direct {v0, p0}, Le/h/d/a/a/w/j;-><init>(Landroid/content/Context;)V */
/* .line 4 */
(( e.h.d.a.a.w.j ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Le/h/d/a/a/w/j;->a(Landroid/content/Context;)Ljava/io/File;
v1 = com.orange.oab.contactless.packid.service.LogManager .a ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 5 */
com.orange.oab.contactless.packid.service.LogManager .a ( p0 );
} // :cond_0
final String v1 = "android.permission.WRITE_EXTERNAL_STORAGE"; // const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"
/* .line 6 */
v1 = c.h.f.f .a ( p0,v1 );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 7 */
/* new-instance v1, Le/h/d/a/a/w/a; */
/* invoke-direct {v1, v0, p1, p0, p2}, Le/h/d/a/a/w/a;-><init>(Le/h/d/a/a/w/j;Ljava/lang/String;Landroid/content/Context;Z)V */
com.orange.oab.contactless.packid.service.LogManager .a ( p0,v1 );
/* .line 8 */
} // :cond_1
(( e.h.d.a.a.w.j ) v0 ).a ( p1, p0, p2 ); // invoke-virtual {v0, p1, p0, p2}, Le/h/d/a/a/w/j;->a(Ljava/lang/String;Landroid/content/Context;Z)V
/* const/high16 p2, -0x1000000 */
int v0 = 0; // const/4 v0, 0x0
/* .line 9 */
com.orange.oab.contactless.packid.service.LogManager .log ( p0,p2,p1,v0,v0 );
} // :cond_2
final String p0 = "LogManager"; // const-string p0, "LogManager"
final String p1 = "Persistent Logs are disabled should not write logs"; // const-string p1, "Persistent Logs are disabled should not write logs"
/* .line 10 */
android.util.Log .v ( p0,p1 );
} // :goto_0
return;
} // .end method
public static void writeToPersistentLog ( android.content.Context p0, java.lang.Throwable p1 ) {
/* .locals 0 */
/* .line 11 */
m.a.a.c.f.c .a ( p1 );
com.orange.oab.contactless.packid.service.LogManager .writeToPersistentLog ( p0,p1 );
return;
} // .end method
