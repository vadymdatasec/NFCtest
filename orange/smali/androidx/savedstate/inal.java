public class inal implements c.n.e {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "RestrictedApi" */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Landroidx/savedstate/Recreator$a; */
/* } */
} // .end annotation
/* # instance fields */
public final c.s.c a;
/* # direct methods */
public inal ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
return;
} // .end method
/* # virtual methods */
public void a ( Object p0, c.n.g$a p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = c.n.g$a.ON_CREATE;
/* if-ne p2, v0, :cond_3 */
/* .line 2 */
(( c.n.g ) p1 ).b ( p0 ); // invoke-virtual {p1, p0}, Lc/n/g;->b(Lc/n/i;)V
/* .line 3 */
p1 = this.a;
final String p2 = "androidx.savedstate.Restarter"; // const-string p2, "androidx.savedstate.Restarter"
/* .line 4 */
(( androidx.savedstate.SavedStateRegistry ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Landroidx/savedstate/SavedStateRegistry;->a(Ljava/lang/String;)Landroid/os/Bundle;
/* if-nez p1, :cond_0 */
return;
} // :cond_0
final String p2 = "classes_to_restore"; // const-string p2, "classes_to_restore"
/* .line 5 */
(( android.os.Bundle ) p1 ).getStringArrayList ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 6 */
(( java.util.ArrayList ) p1 ).iterator ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
p2 = } // :goto_0
if ( p2 != null) { // if-eqz p2, :cond_1
/* check-cast p2, Ljava/lang/String; */
/* .line 7 */
(( androidx.savedstate.Recreator ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Landroidx/savedstate/Recreator;->a(Ljava/lang/String;)V
} // :cond_1
return;
/* .line 8 */
} // :cond_2
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""; // const-string p2, "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 9 */
} // :cond_3
/* new-instance p1, Ljava/lang/AssertionError; */
final String p2 = "Next event must be ON_CREATE"; // const-string p2, "Next event must be ON_CREATE"
/* invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V */
/* throw p1 */
} // .end method
public final void a ( java.lang.String p0 ) {
/* .locals 4 */
/* .line 10 */
try { // :try_start_0
/* const-class v0, Landroidx/savedstate/Recreator; */
/* .line 11 */
(( java.lang.Class ) v0 ).getClassLoader ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
int v1 = 0; // const/4 v1, 0x0
/* .line 12 */
java.lang.Class .forName ( p1,v1,v0 );
/* const-class v2, Landroidx/savedstate/SavedStateRegistry$a; */
/* .line 13 */
(( java.lang.Class ) v0 ).asSubclass ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_2 */
try { // :try_start_1
/* new-array v2, v1, [Ljava/lang/Class; */
/* .line 14 */
(( java.lang.Class ) v0 ).getDeclaredConstructor ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
/* :try_end_1 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_1 ..:try_end_1} :catch_1 */
int v2 = 1; // const/4 v2, 0x1
/* .line 15 */
(( java.lang.reflect.Constructor ) v0 ).setAccessible ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V
try { // :try_start_2
/* new-array v1, v1, [Ljava/lang/Object; */
/* .line 16 */
(( java.lang.reflect.Constructor ) v0 ).newInstance ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Landroidx/savedstate/SavedStateRegistry$a; */
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
/* .line 17 */
p1 = this.a;
return;
/* :catch_0 */
/* move-exception v0 */
/* .line 18 */
/* new-instance v1, Ljava/lang/RuntimeException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Failed to instantiate "; // const-string v3, "Failed to instantiate "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v1 */
/* :catch_1 */
/* move-exception p1 */
/* .line 19 */
/* new-instance v1, Ljava/lang/IllegalStateException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Class"; // const-string v3, "Class"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = " must have default constructor in order to be automatically recreated"; // const-string v0, " must have default constructor in order to be automatically recreated"
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v1 */
/* :catch_2 */
/* move-exception v0 */
/* .line 20 */
/* new-instance v1, Ljava/lang/RuntimeException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Class "; // const-string v3, "Class "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " wasn\'t found"; // const-string p1, " wasn\'t found"
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
