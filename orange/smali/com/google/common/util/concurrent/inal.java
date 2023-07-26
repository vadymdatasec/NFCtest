public class inal extends com.google.common.util.concurrent.CycleDetectingLockFactory$b {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/common/util/concurrent/CycleDetectingLockFactory; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x19 */
/* name = "PotentialDeadlockException" */
} // .end annotation
/* # instance fields */
public final com.google.common.util.concurrent.CycleDetectingLockFactory$b b;
/* # virtual methods */
public java.lang.String getMessage ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-super {p0}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String; */
java.util.Objects .requireNonNull ( v1 );
/* check-cast v1, Ljava/lang/String; */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 2 */
v1 = this.b;
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
final String v2 = ", "; // const-string v2, ", "
/* .line 3 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Throwable ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 4 */
(( java.lang.Throwable ) v1 ).getCause ( ); // invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;
/* .line 5 */
} // :cond_0
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
