public class e.f.c.k.h implements e.f.c.k.i {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/f/c/k/i<", */
	 /* "Landroid/content/Context;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.lang.Class a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Class<", */
/* "+", */
/* "Landroid/app/Service;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.f.c.k.h ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "+", */
/* "Landroid/app/Service;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 3 */
this.a = p1;
return;
} // .end method
public e.f.c.k.h ( ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1}, Le/f/c/k/h;-><init>(Ljava/lang/Class;)V */
return;
} // .end method
/* # virtual methods */
public final android.os.Bundle a ( android.content.Context p0 ) {
/* .locals 5 */
final String v0 = "ComponentDiscovery"; // const-string v0, "ComponentDiscovery"
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
try { // :try_start_0
(( android.content.Context ) p1 ).getPackageManager ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* if-nez v2, :cond_0 */
final String p1 = "Context has no PackageManager."; // const-string p1, "Context has no PackageManager."
/* .line 3 */
android.util.Log .w ( v0,p1 );
/* .line 4 */
} // :cond_0
/* new-instance v3, Landroid/content/ComponentName; */
v4 = this.a;
/* invoke-direct {v3, p1, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* const/16 p1, 0x80 */
/* .line 5 */
(( android.content.pm.PackageManager ) v2 ).getServiceInfo ( v3, p1 ); // invoke-virtual {v2, v3, p1}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;
/* if-nez p1, :cond_1 */
/* .line 6 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
v2 = this.a;
(( java.lang.StringBuilder ) p1 ).append ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " has no service info."; // const-string v2, " has no service info."
(( java.lang.StringBuilder ) p1 ).append ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v0,p1 );
/* .line 7 */
} // :cond_1
p1 = this.metaData;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
final String p1 = "Application info not found."; // const-string p1, "Application info not found."
/* .line 8 */
android.util.Log .w ( v0,p1 );
} // .end method
public java.util.List a ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Landroid/content/Context; */
(( e.f.c.k.h ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/k/h;->b(Landroid/content/Context;)Ljava/util/List;
} // .end method
public java.util.List b ( android.content.Context p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.c.k.h ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/k/h;->a(Landroid/content/Context;)Landroid/os/Bundle;
/* if-nez p1, :cond_0 */
final String p1 = "ComponentDiscovery"; // const-string p1, "ComponentDiscovery"
final String v0 = "Could not retrieve metadata, returning empty list of registrars."; // const-string v0, "Could not retrieve metadata, returning empty list of registrars."
/* .line 2 */
android.util.Log .w ( p1,v0 );
/* .line 3 */
java.util.Collections .emptyList ( );
/* .line 4 */
} // :cond_0
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 5 */
(( android.os.Bundle ) p1 ).keySet ( ); // invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
} // :cond_1
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_2
/* check-cast v2, Ljava/lang/String; */
/* .line 6 */
(( android.os.Bundle ) p1 ).get ( v2 ); // invoke-virtual {p1, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
final String v4 = "com.google.firebase.components.ComponentRegistrar"; // const-string v4, "com.google.firebase.components.ComponentRegistrar"
/* .line 7 */
v3 = (( java.lang.String ) v4 ).equals ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_1
final String v3 = "com.google.firebase.components:"; // const-string v3, "com.google.firebase.components:"
v3 = (( java.lang.String ) v2 ).startsWith ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* const/16 v3, 0x1f */
/* .line 8 */
(( java.lang.String ) v2 ).substring ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;
} // :cond_2
} // .end method
