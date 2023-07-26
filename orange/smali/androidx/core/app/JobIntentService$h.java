public abstract class androidx.core.app.JobIntentService$h {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/core/app/JobIntentService; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x409 */
/* name = "h" */
} // .end annotation
/* # instance fields */
public final android.content.ComponentName a;
public Boolean b;
public Integer c;
/* # direct methods */
public androidx.core.app.JobIntentService$h ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 0 */
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 3 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/core/app/JobIntentService$h;->b:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
/* iput-boolean v0, p0, Landroidx/core/app/JobIntentService$h;->b:Z */
/* .line 3 */
/* iput p1, p0, Landroidx/core/app/JobIntentService$h;->c:I */
/* .line 4 */
} // :cond_0
/* iget v0, p0, Landroidx/core/app/JobIntentService$h;->c:I */
/* if-ne v0, p1, :cond_1 */
} // :goto_0
return;
/* .line 5 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Given job ID "; // const-string v2, "Given job ID "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p1 = " is different than previous "; // const-string p1, " is different than previous "
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget p1, p0, Landroidx/core/app/JobIntentService$h;->c:I */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public abstract void a ( android.content.Intent p0 ) {
} // .end method
public void b ( ) {
/* .locals 0 */
return;
} // .end method
public void c ( ) {
/* .locals 0 */
return;
} // .end method
