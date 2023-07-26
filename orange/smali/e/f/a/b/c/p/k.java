public abstract class e.f.a.b.c.p.k {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.reflect.Method a;
	 public static final java.lang.reflect.Method b;
	 public static final java.lang.reflect.Method c;
	 public static final java.lang.reflect.Method d;
	 /* # direct methods */
	 public static e.f.a.b.c.p.k ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 android.os.Process .myUid ( );
		 /* .line 2 */
		 e.f.a.b.c.p.k .e ( );
		 /* .line 3 */
		 e.f.a.b.c.p.k .f ( );
		 /* .line 4 */
		 e.f.a.b.c.p.k .g ( );
		 /* .line 5 */
		 e.f.a.b.c.p.k .a ( );
		 /* .line 6 */
		 e.f.a.b.c.p.k .b ( );
		 /* .line 7 */
		 e.f.a.b.c.p.k .c ( );
		 /* .line 8 */
		 e.f.a.b.c.p.k .d ( );
		 return;
	 } // .end method
	 public static android.os.WorkSource a ( Integer p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Landroid/os/WorkSource; */
		 /* invoke-direct {v0}, Landroid/os/WorkSource;-><init>()V */
		 /* .line 2 */
		 e.f.a.b.c.p.k .a ( v0,p0,p1 );
	 } // .end method
	 public static android.os.WorkSource a ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 3 */
		 final String v0 = "WorkSourceUtil"; // const-string v0, "WorkSourceUtil"
		 int v1 = 0; // const/4 v1, 0x0
		 if ( p0 != null) { // if-eqz p0, :cond_4
			 /* .line 3 */
			 (( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
			 if ( v2 != null) { // if-eqz v2, :cond_4
				 /* if-nez p1, :cond_0 */
				 /* .line 4 */
			 } // :cond_0
			 try { // :try_start_0
				 e.f.a.b.c.q.b .b ( p0 );
				 int v2 = 0; // const/4 v2, 0x0
				 (( e.f.a.b.c.q.a ) p0 ).a ( p1, v2 ); // invoke-virtual {p0, p1, v2}, Le/f/a/b/c/q/a;->a(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
				 /* :try_end_0 */
				 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* if-nez p0, :cond_2 */
				 final String p0 = "Could not get applicationInfo from package: "; // const-string p0, "Could not get applicationInfo from package: "
				 /* .line 5 */
				 java.lang.String .valueOf ( p1 );
				 v2 = 				 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
				 if ( v2 != null) { // if-eqz v2, :cond_1
					 (( java.lang.String ) p0 ).concat ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
				 } // :cond_1
				 /* new-instance p1, Ljava/lang/String; */
				 /* invoke-direct {p1, p0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
				 /* move-object p0, p1 */
			 } // :goto_0
			 android.util.Log .e ( v0,p0 );
			 /* .line 6 */
		 } // :cond_2
		 /* iget p0, p0, Landroid/content/pm/ApplicationInfo;->uid:I */
		 e.f.a.b.c.p.k .a ( p0,p1 );
		 /* :catch_0 */
		 /* nop */
		 final String p0 = "Could not find package: "; // const-string p0, "Could not find package: "
		 /* .line 7 */
		 java.lang.String .valueOf ( p1 );
		 v2 = 		 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
		 if ( v2 != null) { // if-eqz v2, :cond_3
			 (( java.lang.String ) p0 ).concat ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
		 } // :cond_3
		 /* new-instance p1, Ljava/lang/String; */
		 /* invoke-direct {p1, p0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
		 /* move-object p0, p1 */
	 } // :goto_1
	 android.util.Log .e ( v0,p0 );
} // :cond_4
} // :goto_2
} // .end method
public static java.lang.String a ( android.os.WorkSource p0, Integer p1 ) {
/* .locals 3 */
/* .line 14 */
v0 = e.f.a.b.c.p.k.d;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 1; // const/4 v1, 0x1
try { // :try_start_0
	 /* new-array v1, v1, [Ljava/lang/Object; */
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 15 */
	 java.lang.Integer .valueOf ( p1 );
	 /* aput-object p1, v1, v2 */
	 (( java.lang.reflect.Method ) v0 ).invoke ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast p0, Ljava/lang/String; */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception p0 */
	 final String p1 = "WorkSourceUtil"; // const-string p1, "WorkSourceUtil"
	 final String v0 = "Unable to assign blame through WorkSource"; // const-string v0, "Unable to assign blame through WorkSource"
	 /* .line 16 */
	 android.util.Log .wtf ( p1,v0,p0 );
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static java.lang.reflect.Method a ( ) {
/* .locals 5 */
/* .line 26 */
try { // :try_start_0
	 /* const-class v0, Landroid/os/WorkSource; */
	 final String v1 = "get"; // const-string v1, "get"
	 int v2 = 1; // const/4 v2, 0x1
	 /* new-array v2, v2, [Ljava/lang/Class; */
	 int v3 = 0; // const/4 v3, 0x0
	 v4 = java.lang.Integer.TYPE;
	 /* aput-object v4, v2, v3 */
	 (( java.lang.Class ) v0 ).getMethod ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public static java.util.List a ( android.os.WorkSource p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/os/WorkSource;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* if-nez p0, :cond_0 */
int v1 = 0; // const/4 v1, 0x0
/* .line 17 */
} // :cond_0
v1 = e.f.a.b.c.p.k .b ( p0 );
} // :goto_0
/* if-nez v1, :cond_1 */
/* .line 18 */
java.util.Collections .emptyList ( );
/* .line 19 */
} // :cond_1
/* new-instance v2, Ljava/util/ArrayList; */
/* invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V */
} // :goto_1
/* if-ge v0, v1, :cond_3 */
/* .line 20 */
e.f.a.b.c.p.k .a ( p0,v0 );
/* .line 21 */
v4 = e.f.a.b.c.p.j .a ( v3 );
/* if-nez v4, :cond_2 */
/* .line 22 */
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_3
} // .end method
public static void a ( android.os.WorkSource p0, Integer p1, java.lang.String p2 ) {
/* .locals 6 */
/* .line 8 */
v0 = e.f.a.b.c.p.k.b;
int v1 = 0; // const/4 v1, 0x0
final String v2 = "Unable to assign blame through WorkSource"; // const-string v2, "Unable to assign blame through WorkSource"
final String v3 = "WorkSourceUtil"; // const-string v3, "WorkSourceUtil"
int v4 = 1; // const/4 v4, 0x1
if ( v0 != null) { // if-eqz v0, :cond_1
/* if-nez p2, :cond_0 */
final String p2 = ""; // const-string p2, ""
/* .line 9 */
} // :cond_0
try { // :try_start_0
v0 = e.f.a.b.c.p.k.b;
int v5 = 2; // const/4 v5, 0x2
/* new-array v5, v5, [Ljava/lang/Object; */
java.lang.Integer .valueOf ( p1 );
/* aput-object p1, v5, v1 */
/* aput-object p2, v5, v4 */
(( java.lang.reflect.Method ) v0 ).invoke ( p0, v5 ); // invoke-virtual {v0, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
return;
/* :catch_0 */
/* move-exception p0 */
/* .line 10 */
android.util.Log .wtf ( v3,v2,p0 );
return;
/* .line 11 */
} // :cond_1
p2 = e.f.a.b.c.p.k.a;
if ( p2 != null) { // if-eqz p2, :cond_2
try { // :try_start_1
/* new-array v0, v4, [Ljava/lang/Object; */
/* .line 12 */
java.lang.Integer .valueOf ( p1 );
/* aput-object p1, v0, v1 */
(( java.lang.reflect.Method ) p2 ).invoke ( p0, v0 ); // invoke-virtual {p2, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
return;
/* :catch_1 */
/* move-exception p0 */
/* .line 13 */
android.util.Log .wtf ( v3,v2,p0 );
} // :cond_2
return;
} // .end method
public static Boolean a ( android.content.Context p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p0, :cond_0 */
/* .line 23 */
} // :cond_0
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* if-nez v1, :cond_1 */
/* .line 24 */
} // :cond_1
e.f.a.b.c.q.b .b ( p0 );
/* .line 25 */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
final String v2 = "android.permission.UPDATE_DEVICE_STATS"; // const-string v2, "android.permission.UPDATE_DEVICE_STATS"
p0 = (( e.f.a.b.c.q.a ) v1 ).a ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Le/f/a/b/c/q/a;->a(Ljava/lang/String;Ljava/lang/String;)I
/* if-nez p0, :cond_2 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_2
} // .end method
public static Integer b ( android.os.WorkSource p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = e.f.a.b.c.p.k.c;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
try { // :try_start_0
/* new-array v2, v1, [Ljava/lang/Object; */
/* .line 2 */
(( java.lang.reflect.Method ) v0 ).invoke ( p0, v2 ); // invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Ljava/lang/Integer; */
p0 = (( java.lang.Integer ) p0 ).intValue ( ); // invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
final String v0 = "WorkSourceUtil"; // const-string v0, "WorkSourceUtil"
final String v2 = "Unable to assign blame through WorkSource"; // const-string v2, "Unable to assign blame through WorkSource"
/* .line 3 */
android.util.Log .wtf ( v0,v2,p0 );
} // :cond_0
} // .end method
public static java.lang.reflect.Method b ( ) {
/* .locals 5 */
/* .line 4 */
v0 = e.f.a.b.c.p.h .d ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
try { // :try_start_0
/* const-class v0, Landroid/os/WorkSource; */
final String v1 = "getName"; // const-string v1, "getName"
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Class; */
int v3 = 0; // const/4 v3, 0x0
v4 = java.lang.Integer.TYPE;
/* aput-object v4, v2, v3 */
(( java.lang.Class ) v0 ).getMethod ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public static final java.lang.reflect.Method c ( ) {
/* .locals 3 */
/* .line 1 */
v0 = e.f.a.b.c.p.h .i ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
try { // :try_start_0
/* const-class v0, Landroid/os/WorkSource; */
final String v1 = "createWorkChain"; // const-string v1, "createWorkChain"
int v2 = 0; // const/4 v2, 0x0
/* new-array v2, v2, [Ljava/lang/Class; */
(( java.lang.Class ) v0 ).getMethod ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v1 = "WorkSourceUtil"; // const-string v1, "WorkSourceUtil"
final String v2 = "Missing WorkChain API createWorkChain"; // const-string v2, "Missing WorkChain API createWorkChain"
/* .line 3 */
android.util.Log .w ( v1,v2,v0 );
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public static final java.lang.reflect.Method d ( ) {
/* .locals 5 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "PrivateApi" */
/* } */
} // .end annotation
/* .line 1 */
v0 = e.f.a.b.c.p.h .i ( );
if ( v0 != null) { // if-eqz v0, :cond_0
try { // :try_start_0
final String v0 = "android.os.WorkSource$WorkChain"; // const-string v0, "android.os.WorkSource$WorkChain"
/* .line 2 */
java.lang.Class .forName ( v0 );
final String v1 = "addNode"; // const-string v1, "addNode"
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [Ljava/lang/Class; */
int v3 = 0; // const/4 v3, 0x0
/* .line 3 */
v4 = java.lang.Integer.TYPE;
/* aput-object v4, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
/* const-class v4, Ljava/lang/String; */
/* aput-object v4, v2, v3 */
(( java.lang.Class ) v0 ).getMethod ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v1 = "WorkSourceUtil"; // const-string v1, "WorkSourceUtil"
final String v2 = "Missing WorkChain class"; // const-string v2, "Missing WorkChain class"
/* .line 4 */
android.util.Log .w ( v1,v2,v0 );
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public static java.lang.reflect.Method e ( ) {
/* .locals 5 */
/* .line 1 */
try { // :try_start_0
/* const-class v0, Landroid/os/WorkSource; */
final String v1 = "add"; // const-string v1, "add"
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Class; */
int v3 = 0; // const/4 v3, 0x0
v4 = java.lang.Integer.TYPE;
/* aput-object v4, v2, v3 */
(( java.lang.Class ) v0 ).getMethod ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public static java.lang.reflect.Method f ( ) {
/* .locals 5 */
/* .line 1 */
v0 = e.f.a.b.c.p.h .d ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
try { // :try_start_0
/* const-class v0, Landroid/os/WorkSource; */
final String v1 = "add"; // const-string v1, "add"
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [Ljava/lang/Class; */
int v3 = 0; // const/4 v3, 0x0
v4 = java.lang.Integer.TYPE;
/* aput-object v4, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
/* const-class v4, Ljava/lang/String; */
/* aput-object v4, v2, v3 */
(( java.lang.Class ) v0 ).getMethod ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public static java.lang.reflect.Method g ( ) {
/* .locals 3 */
/* .line 1 */
try { // :try_start_0
/* const-class v0, Landroid/os/WorkSource; */
final String v1 = "size"; // const-string v1, "size"
int v2 = 0; // const/4 v2, 0x0
/* new-array v2, v2, [Ljava/lang/Class; */
(( java.lang.Class ) v0 ).getMethod ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
