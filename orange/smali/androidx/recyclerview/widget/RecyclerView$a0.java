public class androidx.recyclerview.widget.RecyclerView$a0 {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/recyclerview/widget/RecyclerView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "a0" */
} // .end annotation
/* # instance fields */
public Integer a;
public android.util.SparseArray b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/util/SparseArray<", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public Integer c;
public Integer d;
public Integer e;
public Integer f;
public Boolean g;
public Boolean h;
public Boolean i;
public Boolean j;
public Boolean k;
public Boolean l;
public Integer m;
public Long n;
public Integer o;
public Integer p;
public Integer q;
/* # direct methods */
public androidx.recyclerview.widget.RecyclerView$a0 ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = -1; // const/4 v0, -0x1
/* .line 2 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->a:I */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->c:I */
/* .line 4 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->d:I */
int v1 = 1; // const/4 v1, 0x1
/* .line 5 */
/* iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->e:I */
/* .line 6 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->f:I */
/* .line 7 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->g:Z */
/* .line 8 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->h:Z */
/* .line 9 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->i:Z */
/* .line 10 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->j:Z */
/* .line 11 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->k:Z */
/* .line 12 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->l:Z */
return;
} // .end method
/* # virtual methods */
public Integer a ( ) {
/* .locals 2 */
/* .line 10 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->h:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->c:I */
/* iget v1, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->d:I */
/* sub-int/2addr v0, v1 */
} // :cond_0
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->f:I */
} // :goto_0
} // .end method
public void a ( Integer p0 ) {
/* .locals 3 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->e:I */
/* and-int/2addr v0, p1 */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 2 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Layout state should be one of "; // const-string v2, "Layout state should be one of "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 3 */
java.lang.Integer .toBinaryString ( p1 );
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " but it is "; // const-string p1, " but it is "
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget p1, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->e:I */
/* .line 4 */
java.lang.Integer .toBinaryString ( p1 );
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$g p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 5 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->e:I */
/* .line 6 */
p1 = (( androidx.recyclerview.widget.RecyclerView$g ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$g;->a()I
/* iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->f:I */
int p1 = 0; // const/4 p1, 0x0
/* .line 7 */
/* iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->h:Z */
/* .line 8 */
/* iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->i:Z */
/* .line 9 */
/* iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->j:Z */
return;
} // .end method
public Integer b ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->a:I */
} // .end method
public Boolean c ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->a:I */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean d ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->h:Z */
} // .end method
public Boolean e ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->l:Z */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "State{mTargetPosition="; // const-string v1, "State{mTargetPosition="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->a:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", mData="; // const-string v1, ", mData="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ", mItemCount="; // const-string v1, ", mItemCount="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->f:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", mIsMeasuring="; // const-string v1, ", mIsMeasuring="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->j:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v1 = ", mPreviousLayoutItemCount="; // const-string v1, ", mPreviousLayoutItemCount="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->c:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", mDeletedInvisibleItemCountSincePreviousLayout="; // const-string v1, ", mDeletedInvisibleItemCountSincePreviousLayout="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->d:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", mStructureChanged="; // const-string v1, ", mStructureChanged="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->g:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v1 = ", mInPreLayout="; // const-string v1, ", mInPreLayout="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->h:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v1 = ", mRunSimpleAnimations="; // const-string v1, ", mRunSimpleAnimations="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->k:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v1 = ", mRunPredictiveAnimations="; // const-string v1, ", mRunPredictiveAnimations="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$a0;->l:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
/* const/16 v1, 0x7d */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
