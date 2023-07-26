public class androidx.recyclerview.widget.LinearLayoutManager$a {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/recyclerview/widget/LinearLayoutManager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "a" */
} // .end annotation
/* # instance fields */
public c.r.d.c0 a;
public Integer b;
public Integer c;
public Boolean d;
public Boolean e;
/* # direct methods */
public androidx.recyclerview.widget.LinearLayoutManager$a ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
(( androidx.recyclerview.widget.LinearLayoutManager$a ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b()V
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.a;
	 /* .line 2 */
	 v0 = 	 (( c.r.d.c0 ) v0 ).b ( ); // invoke-virtual {v0}, Lc/r/d/c0;->b()I
} // :cond_0
v0 = this.a;
/* .line 3 */
v0 = (( c.r.d.c0 ) v0 ).f ( ); // invoke-virtual {v0}, Lc/r/d/c0;->f()I
} // :goto_0
/* iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I */
return;
} // .end method
public void a ( android.view.View p0, Integer p1 ) {
/* .locals 1 */
/* .line 7 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 8 */
v0 = this.a;
p1 = (( c.r.d.c0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/r/d/c0;->a(Landroid/view/View;)I
v0 = this.a;
/* .line 9 */
v0 = (( c.r.d.c0 ) v0 ).h ( ); // invoke-virtual {v0}, Lc/r/d/c0;->h()I
/* add-int/2addr p1, v0 */
/* iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I */
/* .line 10 */
} // :cond_0
v0 = this.a;
p1 = (( c.r.d.c0 ) v0 ).d ( p1 ); // invoke-virtual {v0, p1}, Lc/r/d/c0;->d(Landroid/view/View;)I
/* iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I */
/* .line 11 */
} // :goto_0
/* iput p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b:I */
return;
} // .end method
public Boolean a ( android.view.View p0, androidx.recyclerview.widget.RecyclerView$a0 p1 ) {
/* .locals 1 */
/* .line 4 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p1, Landroidx/recyclerview/widget/RecyclerView$p; */
/* .line 5 */
v0 = (( androidx.recyclerview.widget.RecyclerView$p ) p1 ).c ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$p;->c()Z
/* if-nez v0, :cond_0 */
v0 = (( androidx.recyclerview.widget.RecyclerView$p ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$p;->a()I
/* if-ltz v0, :cond_0 */
/* .line 6 */
p1 = (( androidx.recyclerview.widget.RecyclerView$p ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$p;->a()I
p2 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p2 ).a ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
/* if-ge p1, p2, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public void b ( ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
/* .line 1 */
/* iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b:I */
/* const/high16 v0, -0x80000000 */
/* .line 2 */
/* iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->d:Z */
/* .line 4 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->e:Z */
return;
} // .end method
public void b ( android.view.View p0, Integer p1 ) {
/* .locals 4 */
/* .line 5 */
v0 = this.a;
v0 = (( c.r.d.c0 ) v0 ).h ( ); // invoke-virtual {v0}, Lc/r/d/c0;->h()I
/* if-ltz v0, :cond_0 */
/* .line 6 */
(( androidx.recyclerview.widget.LinearLayoutManager$a ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager$a;->a(Landroid/view/View;I)V
return;
/* .line 7 */
} // :cond_0
/* iput p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b:I */
/* .line 8 */
/* iget-boolean p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->d:Z */
int v1 = 0; // const/4 v1, 0x0
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 9 */
p2 = this.a;
p2 = (( c.r.d.c0 ) p2 ).b ( ); // invoke-virtual {p2}, Lc/r/d/c0;->b()I
/* sub-int/2addr p2, v0 */
/* .line 10 */
v0 = this.a;
v0 = (( c.r.d.c0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/r/d/c0;->a(Landroid/view/View;)I
/* sub-int/2addr p2, v0 */
/* .line 11 */
v0 = this.a;
v0 = (( c.r.d.c0 ) v0 ).b ( ); // invoke-virtual {v0}, Lc/r/d/c0;->b()I
/* sub-int/2addr v0, p2 */
/* iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I */
/* if-lez p2, :cond_2 */
/* .line 12 */
v0 = this.a;
v0 = (( c.r.d.c0 ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/r/d/c0;->b(Landroid/view/View;)I
/* .line 13 */
/* iget v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I */
/* sub-int/2addr v2, v0 */
/* .line 14 */
v0 = this.a;
v0 = (( c.r.d.c0 ) v0 ).f ( ); // invoke-virtual {v0}, Lc/r/d/c0;->f()I
/* .line 15 */
v3 = this.a;
p1 = (( c.r.d.c0 ) v3 ).d ( p1 ); // invoke-virtual {v3, p1}, Lc/r/d/c0;->d(Landroid/view/View;)I
/* sub-int/2addr p1, v0 */
/* .line 16 */
p1 = java.lang.Math .min ( p1,v1 );
/* add-int/2addr v0, p1 */
/* sub-int/2addr v2, v0 */
/* if-gez v2, :cond_2 */
/* .line 17 */
/* iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I */
/* neg-int v0, v2 */
p2 = java.lang.Math .min ( p2,v0 );
/* add-int/2addr p1, p2 */
/* iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I */
/* .line 18 */
} // :cond_1
p2 = this.a;
p2 = (( c.r.d.c0 ) p2 ).d ( p1 ); // invoke-virtual {p2, p1}, Lc/r/d/c0;->d(Landroid/view/View;)I
/* .line 19 */
v2 = this.a;
v2 = (( c.r.d.c0 ) v2 ).f ( ); // invoke-virtual {v2}, Lc/r/d/c0;->f()I
/* sub-int v2, p2, v2 */
/* .line 20 */
/* iput p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I */
/* if-lez v2, :cond_2 */
/* .line 21 */
v3 = this.a;
/* .line 22 */
v3 = (( c.r.d.c0 ) v3 ).b ( p1 ); // invoke-virtual {v3, p1}, Lc/r/d/c0;->b(Landroid/view/View;)I
/* add-int/2addr p2, v3 */
/* .line 23 */
v3 = this.a;
v3 = (( c.r.d.c0 ) v3 ).b ( ); // invoke-virtual {v3}, Lc/r/d/c0;->b()I
/* sub-int/2addr v3, v0 */
/* .line 24 */
v0 = this.a;
/* .line 25 */
p1 = (( c.r.d.c0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/r/d/c0;->a(Landroid/view/View;)I
/* sub-int/2addr v3, p1 */
/* .line 26 */
p1 = this.a;
p1 = (( c.r.d.c0 ) p1 ).b ( ); // invoke-virtual {p1}, Lc/r/d/c0;->b()I
/* .line 27 */
v0 = java.lang.Math .min ( v1,v3 );
/* sub-int/2addr p1, v0 */
/* sub-int/2addr p1, p2 */
/* if-gez p1, :cond_2 */
/* .line 28 */
/* iget p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I */
/* neg-int p1, p1 */
p1 = java.lang.Math .min ( v2,p1 );
/* sub-int/2addr p2, p1 */
/* iput p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I */
} // :cond_2
} // :goto_0
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "AnchorInfo{mPosition="; // const-string v1, "AnchorInfo{mPosition="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", mCoordinate="; // const-string v1, ", mCoordinate="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", mLayoutFromEnd="; // const-string v1, ", mLayoutFromEnd="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->d:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v1 = ", mValid="; // const-string v1, ", mValid="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$a;->e:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
/* const/16 v1, 0x7d */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
