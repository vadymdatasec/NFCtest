public abstract class c.r.d.l0 extends androidx.recyclerview.widget.RecyclerView$l {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Boolean g;
	 /* # direct methods */
	 public c.r.d.l0 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$l;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lc/r/d/l0;->g:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( androidx.recyclerview.widget.RecyclerView$d0 p0, Boolean p1 ) {
		 /* .locals 0 */
		 /* .line 13 */
		 (( c.r.d.l0 ) p0 ).c ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/r/d/l0;->c(Landroidx/recyclerview/widget/RecyclerView$d0;Z)V
		 /* .line 14 */
		 (( androidx.recyclerview.widget.RecyclerView$l ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$l;->b(Landroidx/recyclerview/widget/RecyclerView$d0;)V
		 return;
	 } // .end method
	 public Boolean a ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget-boolean v0, p0, Lc/r/d/l0;->g:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 p1 = 			 (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).p ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->p()Z
			 if ( p1 != null) { // if-eqz p1, :cond_0
			 } // :cond_0
			 int p1 = 0; // const/4 p1, 0x0
		 } // :cond_1
	 } // :goto_0
	 int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public abstract Boolean a ( androidx.recyclerview.widget.RecyclerView$d0 p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
} // .end method
public abstract Boolean a ( androidx.recyclerview.widget.RecyclerView$d0 p0, androidx.recyclerview.widget.RecyclerView$d0 p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
} // .end method
public Boolean a ( androidx.recyclerview.widget.RecyclerView$d0 p0, androidx.recyclerview.widget.RecyclerView$d0 p1, androidx.recyclerview.widget.RecyclerView$l$b p2, androidx.recyclerview.widget.RecyclerView$l$b p3 ) {
/* .locals 7 */
/* .line 5 */
/* iget v3, p3, Landroidx/recyclerview/widget/RecyclerView$l$b;->a:I */
/* .line 6 */
/* iget v4, p3, Landroidx/recyclerview/widget/RecyclerView$l$b;->b:I */
/* .line 7 */
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p2 ).z ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$d0;->z()Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 8 */
	 /* iget p4, p3, Landroidx/recyclerview/widget/RecyclerView$l$b;->a:I */
	 /* .line 9 */
	 /* iget p3, p3, Landroidx/recyclerview/widget/RecyclerView$l$b;->b:I */
	 /* move v6, p3 */
	 /* move v5, p4 */
	 /* .line 10 */
} // :cond_0
/* iget p3, p4, Landroidx/recyclerview/widget/RecyclerView$l$b;->a:I */
/* .line 11 */
/* iget p4, p4, Landroidx/recyclerview/widget/RecyclerView$l$b;->b:I */
/* move v5, p3 */
/* move v6, p4 */
} // :goto_0
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* .line 12 */
p1 = /* invoke-virtual/range {v0 ..v6}, Lc/r/d/l0;->a(Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$d0;IIII)Z */
} // .end method
public Boolean a ( androidx.recyclerview.widget.RecyclerView$d0 p0, androidx.recyclerview.widget.RecyclerView$l$b p1, androidx.recyclerview.widget.RecyclerView$l$b p2 ) {
/* .locals 8 */
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 2 */
/* iget v0, p2, Landroidx/recyclerview/widget/RecyclerView$l$b;->a:I */
/* iget v1, p3, Landroidx/recyclerview/widget/RecyclerView$l$b;->a:I */
/* if-ne v0, v1, :cond_0 */
/* iget v0, p2, Landroidx/recyclerview/widget/RecyclerView$l$b;->b:I */
/* iget v1, p3, Landroidx/recyclerview/widget/RecyclerView$l$b;->b:I */
/* if-eq v0, v1, :cond_1 */
/* .line 3 */
} // :cond_0
/* iget v4, p2, Landroidx/recyclerview/widget/RecyclerView$l$b;->a:I */
/* iget v5, p2, Landroidx/recyclerview/widget/RecyclerView$l$b;->b:I */
/* iget v6, p3, Landroidx/recyclerview/widget/RecyclerView$l$b;->a:I */
/* iget v7, p3, Landroidx/recyclerview/widget/RecyclerView$l$b;->b:I */
/* move-object v2, p0 */
/* move-object v3, p1 */
p1 = /* invoke-virtual/range {v2 ..v7}, Lc/r/d/l0;->a(Landroidx/recyclerview/widget/RecyclerView$d0;IIII)Z */
/* .line 4 */
} // :cond_1
p1 = (( c.r.d.l0 ) p0 ).f ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/l0;->f(Landroidx/recyclerview/widget/RecyclerView$d0;)Z
} // .end method
public final void b ( androidx.recyclerview.widget.RecyclerView$d0 p0, Boolean p1 ) {
/* .locals 0 */
/* .line 12 */
(( c.r.d.l0 ) p0 ).d ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/r/d/l0;->d(Landroidx/recyclerview/widget/RecyclerView$d0;Z)V
return;
} // .end method
public Boolean b ( androidx.recyclerview.widget.RecyclerView$d0 p0, androidx.recyclerview.widget.RecyclerView$l$b p1, androidx.recyclerview.widget.RecyclerView$l$b p2 ) {
/* .locals 6 */
/* .line 1 */
/* iget v2, p2, Landroidx/recyclerview/widget/RecyclerView$l$b;->a:I */
/* .line 2 */
/* iget v3, p2, Landroidx/recyclerview/widget/RecyclerView$l$b;->b:I */
/* .line 3 */
p2 = this.a;
/* if-nez p3, :cond_0 */
/* .line 4 */
v0 = (( android.view.View ) p2 ).getLeft ( ); // invoke-virtual {p2}, Landroid/view/View;->getLeft()I
} // :cond_0
/* iget v0, p3, Landroidx/recyclerview/widget/RecyclerView$l$b;->a:I */
} // :goto_0
/* move v4, v0 */
/* if-nez p3, :cond_1 */
/* .line 5 */
p3 = (( android.view.View ) p2 ).getTop ( ); // invoke-virtual {p2}, Landroid/view/View;->getTop()I
} // :cond_1
/* iget p3, p3, Landroidx/recyclerview/widget/RecyclerView$l$b;->b:I */
} // :goto_1
/* move v5, p3 */
/* .line 6 */
p3 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).r ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->r()Z
/* if-nez p3, :cond_3 */
/* if-ne v2, v4, :cond_2 */
/* if-eq v3, v5, :cond_3 */
/* .line 7 */
} // :cond_2
p3 = (( android.view.View ) p2 ).getWidth ( ); // invoke-virtual {p2}, Landroid/view/View;->getWidth()I
/* add-int/2addr p3, v4 */
/* .line 8 */
v0 = (( android.view.View ) p2 ).getHeight ( ); // invoke-virtual {p2}, Landroid/view/View;->getHeight()I
/* add-int/2addr v0, v5 */
/* .line 9 */
(( android.view.View ) p2 ).layout ( v4, v5, p3, v0 ); // invoke-virtual {p2, v4, v5, p3, v0}, Landroid/view/View;->layout(IIII)V
/* move-object v0, p0 */
/* move-object v1, p1 */
/* .line 10 */
p1 = /* invoke-virtual/range {v0 ..v5}, Lc/r/d/l0;->a(Landroidx/recyclerview/widget/RecyclerView$d0;IIII)Z */
/* .line 11 */
} // :cond_3
p1 = (( c.r.d.l0 ) p0 ).g ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/l0;->g(Landroidx/recyclerview/widget/RecyclerView$d0;)Z
} // .end method
public void c ( androidx.recyclerview.widget.RecyclerView$d0 p0, Boolean p1 ) {
/* .locals 0 */
return;
} // .end method
public Boolean c ( androidx.recyclerview.widget.RecyclerView$d0 p0, androidx.recyclerview.widget.RecyclerView$l$b p1, androidx.recyclerview.widget.RecyclerView$l$b p2 ) {
/* .locals 6 */
/* .line 1 */
/* iget v0, p2, Landroidx/recyclerview/widget/RecyclerView$l$b;->a:I */
/* iget v1, p3, Landroidx/recyclerview/widget/RecyclerView$l$b;->a:I */
/* if-ne v0, v1, :cond_1 */
/* iget v0, p2, Landroidx/recyclerview/widget/RecyclerView$l$b;->b:I */
/* iget v1, p3, Landroidx/recyclerview/widget/RecyclerView$l$b;->b:I */
/* if-eq v0, v1, :cond_0 */
/* .line 2 */
} // :cond_0
(( c.r.d.l0 ) p0 ).j ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/l0;->j(Landroidx/recyclerview/widget/RecyclerView$d0;)V
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
} // :cond_1
} // :goto_0
/* iget v2, p2, Landroidx/recyclerview/widget/RecyclerView$l$b;->a:I */
/* iget v3, p2, Landroidx/recyclerview/widget/RecyclerView$l$b;->b:I */
/* iget v4, p3, Landroidx/recyclerview/widget/RecyclerView$l$b;->a:I */
/* iget v5, p3, Landroidx/recyclerview/widget/RecyclerView$l$b;->b:I */
/* move-object v0, p0 */
/* move-object v1, p1 */
p1 = /* invoke-virtual/range {v0 ..v5}, Lc/r/d/l0;->a(Landroidx/recyclerview/widget/RecyclerView$d0;IIII)Z */
} // .end method
public void d ( androidx.recyclerview.widget.RecyclerView$d0 p0, Boolean p1 ) {
/* .locals 0 */
return;
} // .end method
public abstract Boolean f ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
} // .end method
public abstract Boolean g ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
} // .end method
public final void h ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 0 */
/* .line 1 */
(( c.r.d.l0 ) p0 ).n ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/l0;->n(Landroidx/recyclerview/widget/RecyclerView$d0;)V
/* .line 2 */
(( androidx.recyclerview.widget.RecyclerView$l ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$l;->b(Landroidx/recyclerview/widget/RecyclerView$d0;)V
return;
} // .end method
public final void i ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 0 */
/* .line 1 */
(( c.r.d.l0 ) p0 ).o ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/l0;->o(Landroidx/recyclerview/widget/RecyclerView$d0;)V
return;
} // .end method
public final void j ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 0 */
/* .line 1 */
(( c.r.d.l0 ) p0 ).p ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/l0;->p(Landroidx/recyclerview/widget/RecyclerView$d0;)V
/* .line 2 */
(( androidx.recyclerview.widget.RecyclerView$l ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$l;->b(Landroidx/recyclerview/widget/RecyclerView$d0;)V
return;
} // .end method
public final void k ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 0 */
/* .line 1 */
(( c.r.d.l0 ) p0 ).q ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/l0;->q(Landroidx/recyclerview/widget/RecyclerView$d0;)V
return;
} // .end method
public final void l ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 0 */
/* .line 1 */
(( c.r.d.l0 ) p0 ).r ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/l0;->r(Landroidx/recyclerview/widget/RecyclerView$d0;)V
/* .line 2 */
(( androidx.recyclerview.widget.RecyclerView$l ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$l;->b(Landroidx/recyclerview/widget/RecyclerView$d0;)V
return;
} // .end method
public final void m ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 0 */
/* .line 1 */
(( c.r.d.l0 ) p0 ).s ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/l0;->s(Landroidx/recyclerview/widget/RecyclerView$d0;)V
return;
} // .end method
public void n ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 0 */
return;
} // .end method
public void o ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 0 */
return;
} // .end method
public void p ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 0 */
return;
} // .end method
public void q ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 0 */
return;
} // .end method
public void r ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 0 */
return;
} // .end method
public void s ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 0 */
return;
} // .end method
