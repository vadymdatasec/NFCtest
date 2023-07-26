public class e.f.a.a.j.g0.o {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.Context a;
	 public java.util.Map b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.f.a.a.j.g0.o ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.b = v0;
/* .line 3 */
this.a = p1;
return;
} // .end method
public static android.os.Bundle b ( android.content.Context p0 ) {
/* .locals 5 */
final String v0 = "BackendRegistry"; // const-string v0, "BackendRegistry"
int v1 = 0; // const/4 v1, 0x0
/* .line 1 */
try { // :try_start_0
	 (( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
	 /* if-nez v2, :cond_0 */
	 final String p0 = "Context has no PackageManager."; // const-string p0, "Context has no PackageManager."
	 /* .line 2 */
	 android.util.Log .w ( v0,p0 );
	 /* .line 3 */
} // :cond_0
/* new-instance v3, Landroid/content/ComponentName; */
/* const-class v4, Lcom/google/android/datatransport/runtime/backends/TransportBackendDiscovery; */
/* invoke-direct {v3, p0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* const/16 p0, 0x80 */
/* .line 4 */
(( android.content.pm.PackageManager ) v2 ).getServiceInfo ( v3, p0 ); // invoke-virtual {v2, v3, p0}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;
/* if-nez p0, :cond_1 */
final String p0 = "TransportBackendDiscovery has no service info."; // const-string p0, "TransportBackendDiscovery has no service info."
/* .line 5 */
android.util.Log .w ( v0,p0 );
/* .line 6 */
} // :cond_1
p0 = this.metaData;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
final String p0 = "Application info not found."; // const-string p0, "Application info not found."
/* .line 7 */
android.util.Log .w ( v0,p0 );
} // .end method
/* # virtual methods */
public e.f.a.a.j.g0.f a ( java.lang.String p0 ) {
/* .locals 8 */
final String v0 = "Could not instantiate %s"; // const-string v0, "Could not instantiate %s"
final String v1 = "Could not instantiate %s."; // const-string v1, "Could not instantiate %s."
final String v2 = "BackendRegistry"; // const-string v2, "BackendRegistry"
/* .line 1 */
(( e.f.a.a.j.g0.o ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/a/j/g0/o;->a()Ljava/util/Map;
/* check-cast p1, Ljava/lang/String; */
int v3 = 0; // const/4 v3, 0x0
/* if-nez p1, :cond_0 */
} // :cond_0
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
/* .line 2 */
try { // :try_start_0
java.lang.Class .forName ( p1 );
/* const-class v7, Le/f/a/a/j/g0/f; */
/* .line 3 */
(( java.lang.Class ) v6 ).asSubclass ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;
/* new-array v7, v5, [Ljava/lang/Class; */
/* .line 4 */
(( java.lang.Class ) v6 ).getDeclaredConstructor ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
/* new-array v7, v5, [Ljava/lang/Object; */
/* .line 5 */
(( java.lang.reflect.Constructor ) v6 ).newInstance ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v6, Le/f/a/a/j/g0/f; */
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_4 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_3 */
/* .catch Ljava/lang/InstantiationException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v1 */
/* new-array v4, v4, [Ljava/lang/Object; */
/* aput-object p1, v4, v5 */
/* .line 6 */
java.lang.String .format ( v0,v4 );
android.util.Log .w ( v2,p1,v1 );
/* :catch_1 */
/* move-exception v1 */
/* new-array v4, v4, [Ljava/lang/Object; */
/* aput-object p1, v4, v5 */
/* .line 7 */
java.lang.String .format ( v0,v4 );
android.util.Log .w ( v2,p1,v1 );
/* :catch_2 */
/* move-exception v0 */
/* new-array v4, v4, [Ljava/lang/Object; */
/* aput-object p1, v4, v5 */
/* .line 8 */
java.lang.String .format ( v1,v4 );
android.util.Log .w ( v2,p1,v0 );
/* :catch_3 */
/* move-exception v0 */
/* new-array v4, v4, [Ljava/lang/Object; */
/* aput-object p1, v4, v5 */
/* .line 9 */
java.lang.String .format ( v1,v4 );
android.util.Log .w ( v2,p1,v0 );
/* :catch_4 */
/* move-exception v0 */
/* new-array v1, v4, [Ljava/lang/Object; */
/* aput-object p1, v1, v5 */
final String p1 = "Class %s is not found."; // const-string p1, "Class %s is not found."
/* .line 10 */
java.lang.String .format ( p1,v1 );
android.util.Log .w ( v2,p1,v0 );
} // :goto_0
} // .end method
public final java.util.Map a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 11 */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* .line 12 */
v0 = this.a;
(( e.f.a.a.j.g0.o ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/a/a/j/g0/o;->a(Landroid/content/Context;)Ljava/util/Map;
this.b = v0;
/* .line 13 */
} // :cond_0
v0 = this.b;
} // .end method
public final java.util.Map a ( android.content.Context p0 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* ")", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 14 */
e.f.a.a.j.g0.o .b ( p1 );
/* if-nez p1, :cond_0 */
final String p1 = "BackendRegistry"; // const-string p1, "BackendRegistry"
final String v0 = "Could not retrieve metadata, returning empty list of transport backends."; // const-string v0, "Could not retrieve metadata, returning empty list of transport backends."
/* .line 15 */
android.util.Log .w ( p1,v0 );
/* .line 16 */
java.util.Collections .emptyMap ( );
/* .line 17 */
} // :cond_0
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 18 */
(( android.os.Bundle ) p1 ).keySet ( ); // invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
v2 = } // :cond_1
if ( v2 != null) { // if-eqz v2, :cond_3
/* check-cast v2, Ljava/lang/String; */
/* .line 19 */
(( android.os.Bundle ) p1 ).get ( v2 ); // invoke-virtual {p1, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
/* .line 20 */
/* instance-of v4, v3, Ljava/lang/String; */
if ( v4 != null) { // if-eqz v4, :cond_1
final String v4 = "backend:"; // const-string v4, "backend:"
v4 = (( java.lang.String ) v2 ).startsWith ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 21 */
/* check-cast v3, Ljava/lang/String; */
int v4 = -1; // const/4 v4, -0x1
final String v5 = ","; // const-string v5, ","
(( java.lang.String ) v3 ).split ( v5, v4 ); // invoke-virtual {v3, v5, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;
/* array-length v4, v3 */
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
/* if-ge v5, v4, :cond_1 */
/* aget-object v6, v3, v5 */
/* .line 22 */
(( java.lang.String ) v6 ).trim ( ); // invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 23 */
v7 = (( java.lang.String ) v6 ).isEmpty ( ); // invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z
if ( v7 != null) { // if-eqz v7, :cond_2
} // :cond_2
/* const/16 v7, 0x8 */
/* .line 24 */
(( java.lang.String ) v2 ).substring ( v7 ); // invoke-virtual {v2, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;
} // :goto_1
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_3
} // .end method
