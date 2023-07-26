public abstract class androidx.lifecycle.LiveData$b {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/lifecycle/LiveData; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x401 */
/* name = "b" */
} // .end annotation
/* # instance fields */
public final c.n.q a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/n/q<", */
/* "-TT;>;" */
/* } */
} // .end annotation
} // .end field
public Boolean b;
public Integer c;
public final androidx.lifecycle.LiveData d; //synthetic
/* # direct methods */
public androidx.lifecycle.LiveData$b ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/n/q<", */
/* "-TT;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
this.d = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int p1 = -1; // const/4 p1, -0x1
/* .line 2 */
/* iput p1, p0, Landroidx/lifecycle/LiveData$b;->c:I */
/* .line 3 */
this.a = p2;
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 0 */
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/lifecycle/LiveData$b;->b:Z */
/* if-ne p1, v0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
/* iput-boolean p1, p0, Landroidx/lifecycle/LiveData$b;->b:Z */
/* .line 3 */
v0 = this.d;
if ( p1 != null) { // if-eqz p1, :cond_1
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = -1; // const/4 p1, -0x1
} // :goto_0
(( androidx.lifecycle.LiveData ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Landroidx/lifecycle/LiveData;->a(I)V
/* .line 4 */
/* iget-boolean p1, p0, Landroidx/lifecycle/LiveData$b;->b:Z */
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 5 */
p1 = this.d;
(( androidx.lifecycle.LiveData ) p1 ).b ( p0 ); // invoke-virtual {p1, p0}, Landroidx/lifecycle/LiveData;->b(Landroidx/lifecycle/LiveData$b;)V
} // :cond_2
return;
} // .end method
public abstract Boolean b ( ) {
} // .end method
