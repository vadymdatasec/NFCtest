public class e.f.d.d0.g implements e.f.d.d0.s {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/f/d/d0/s<", */
	 /* "TT;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.lang.reflect.Constructor a; //synthetic
/* # direct methods */
public e.f.d.d0.g ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.a = p2;
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public java.lang.Object a ( ) {
	 /* .locals 5 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "()TT;" */
	 /* } */
} // .end annotation
final String v0 = " with no args"; // const-string v0, " with no args"
final String v1 = "Failed to invoke "; // const-string v1, "Failed to invoke "
int v2 = 0; // const/4 v2, 0x0
/* .line 1 */
try { // :try_start_0
	 v3 = this.a;
	 (( java.lang.reflect.Constructor ) v3 ).newInstance ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/InstantiationException; {:try_start_0 ..:try_end_0} :catch_2 */
	 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 2 */
	 /* new-instance v1, Ljava/lang/AssertionError; */
	 /* invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V */
	 /* throw v1 */
	 /* :catch_1 */
	 /* move-exception v2 */
	 /* .line 3 */
	 /* new-instance v3, Ljava/lang/RuntimeException; */
	 /* new-instance v4, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
	 (( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v1 = this.a;
	 (( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( java.lang.reflect.InvocationTargetException ) v2 ).getTargetException ( ); // invoke-virtual {v2}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
	 /* invoke-direct {v3, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
	 /* throw v3 */
	 /* :catch_2 */
	 /* move-exception v2 */
	 /* .line 4 */
	 /* new-instance v3, Ljava/lang/RuntimeException; */
	 /* new-instance v4, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
	 (( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v1 = this.a;
	 (( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v3, v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
	 /* throw v3 */
} // .end method
