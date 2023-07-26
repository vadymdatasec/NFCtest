public class e.f.d.d0.m implements e.f.d.d0.s {
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
public final e.f.d.d0.f0 a;
public final java.lang.Class b; //synthetic
public final java.lang.reflect.Type c; //synthetic
/* # direct methods */
public e.f.d.d0.m ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.b = p2;
	 this.c = p3;
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 e.f.d.d0.f0 .a ( );
	 this.a = p1;
	 return;
} // .end method
/* # virtual methods */
public java.lang.Object a ( ) {
	 /* .locals 4 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "()TT;" */
	 /* } */
} // .end annotation
/* .line 1 */
try { // :try_start_0
	 v0 = this.a;
	 v1 = this.b;
	 (( e.f.d.d0.f0 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/d/d0/f0;->a(Ljava/lang/Class;)Ljava/lang/Object;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 2 */
	 /* new-instance v1, Ljava/lang/RuntimeException; */
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v3 = "Unable to invoke no-args constructor for "; // const-string v3, "Unable to invoke no-args constructor for "
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v3 = this.c;
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 final String v3 = "."; // const-string v3, "."
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v3 = "Register an InstanceCreator with Gson for this type may fix this problem."; // const-string v3, "Register an InstanceCreator with Gson for this type may fix this problem."
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
	 /* throw v1 */
} // .end method
