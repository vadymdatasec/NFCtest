public class c.r.d.w {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Boolean a;
	 public Integer b;
	 public Integer c;
	 public Integer d;
	 public Integer e;
	 public Integer f;
	 public Integer g;
	 public Boolean h;
	 public Boolean i;
	 /* # direct methods */
	 public c.r.d.w ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lc/r/d/w;->a:Z */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 /* iput v0, p0, Lc/r/d/w;->f:I */
		 /* .line 4 */
		 /* iput v0, p0, Lc/r/d/w;->g:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.view.View a ( androidx.recyclerview.widget.RecyclerView$v p0 ) {
		 /* .locals 2 */
		 /* .line 2 */
		 /* iget v0, p0, Lc/r/d/w;->c:I */
		 (( androidx.recyclerview.widget.RecyclerView$v ) p1 ).d ( v0 ); // invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$v;->d(I)Landroid/view/View;
		 /* .line 3 */
		 /* iget v0, p0, Lc/r/d/w;->c:I */
		 /* iget v1, p0, Lc/r/d/w;->d:I */
		 /* add-int/2addr v0, v1 */
		 /* iput v0, p0, Lc/r/d/w;->c:I */
	 } // .end method
	 public Boolean a ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Lc/r/d/w;->c:I */
		 /* if-ltz v0, :cond_0 */
		 p1 = 		 (( androidx.recyclerview.widget.RecyclerView$a0 ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
		 /* if-ge v0, p1, :cond_0 */
		 int p1 = 1; // const/4 p1, 0x1
	 } // :cond_0
	 int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "LayoutState{mAvailable="; // const-string v1, "LayoutState{mAvailable="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lc/r/d/w;->b:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", mCurrentPosition="; // const-string v1, ", mCurrentPosition="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lc/r/d/w;->c:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", mItemDirection="; // const-string v1, ", mItemDirection="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lc/r/d/w;->d:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", mLayoutDirection="; // const-string v1, ", mLayoutDirection="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lc/r/d/w;->e:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", mStartLine="; // const-string v1, ", mStartLine="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lc/r/d/w;->f:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", mEndLine="; // const-string v1, ", mEndLine="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lc/r/d/w;->g:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* const/16 v1, 0x7d */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
