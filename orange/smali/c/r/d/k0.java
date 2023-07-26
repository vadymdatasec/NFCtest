public abstract class c.r.d.k0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( androidx.recyclerview.widget.RecyclerView$a0 p0, c.r.d.c0 p1, android.view.View p2, android.view.View p3, androidx.recyclerview.widget.RecyclerView$o p4, Boolean p5 ) {
		 /* .locals 1 */
		 /* .line 19 */
		 v0 = 		 (( androidx.recyclerview.widget.RecyclerView$o ) p4 ).e ( ); // invoke-virtual {p4}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 p0 = 			 (( androidx.recyclerview.widget.RecyclerView$a0 ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
			 if ( p0 != null) { // if-eqz p0, :cond_2
				 if ( p2 != null) { // if-eqz p2, :cond_2
					 /* if-nez p3, :cond_0 */
				 } // :cond_0
				 /* if-nez p5, :cond_1 */
				 /* .line 20 */
				 p0 = 				 (( androidx.recyclerview.widget.RecyclerView$o ) p4 ).l ( p2 ); // invoke-virtual {p4, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
				 p1 = 				 (( androidx.recyclerview.widget.RecyclerView$o ) p4 ).l ( p3 ); // invoke-virtual {p4, p3}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
				 /* sub-int/2addr p0, p1 */
				 p0 = 				 java.lang.Math .abs ( p0 );
				 /* add-int/lit8 p0, p0, 0x1 */
				 /* .line 21 */
			 } // :cond_1
			 p0 = 			 (( c.r.d.c0 ) p1 ).a ( p3 ); // invoke-virtual {p1, p3}, Lc/r/d/c0;->a(Landroid/view/View;)I
			 /* .line 22 */
			 p2 = 			 (( c.r.d.c0 ) p1 ).d ( p2 ); // invoke-virtual {p1, p2}, Lc/r/d/c0;->d(Landroid/view/View;)I
			 /* sub-int/2addr p0, p2 */
			 /* .line 23 */
			 p1 = 			 (( c.r.d.c0 ) p1 ).g ( ); // invoke-virtual {p1}, Lc/r/d/c0;->g()I
			 p0 = 			 java.lang.Math .min ( p1,p0 );
		 } // :cond_2
	 } // :goto_0
	 int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Integer a ( androidx.recyclerview.widget.RecyclerView$a0 p0, c.r.d.c0 p1, android.view.View p2, android.view.View p3, androidx.recyclerview.widget.RecyclerView$o p4, Boolean p5, Boolean p6 ) {
	 /* .locals 4 */
	 /* .line 1 */
	 v0 = 	 (( androidx.recyclerview.widget.RecyclerView$o ) p4 ).e ( ); // invoke-virtual {p4}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
	 int v1 = 0; // const/4 v1, 0x0
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 v0 = 		 (( androidx.recyclerview.widget.RecyclerView$a0 ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
		 if ( v0 != null) { // if-eqz v0, :cond_3
			 if ( p2 != null) { // if-eqz p2, :cond_3
				 /* if-nez p3, :cond_0 */
				 /* .line 2 */
			 } // :cond_0
			 v0 = 			 (( androidx.recyclerview.widget.RecyclerView$o ) p4 ).l ( p2 ); // invoke-virtual {p4, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
			 /* .line 3 */
			 v2 = 			 (( androidx.recyclerview.widget.RecyclerView$o ) p4 ).l ( p3 ); // invoke-virtual {p4, p3}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
			 /* .line 4 */
			 v0 = 			 java.lang.Math .min ( v0,v2 );
			 /* .line 5 */
			 v2 = 			 (( androidx.recyclerview.widget.RecyclerView$o ) p4 ).l ( p2 ); // invoke-virtual {p4, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
			 /* .line 6 */
			 v3 = 			 (( androidx.recyclerview.widget.RecyclerView$o ) p4 ).l ( p3 ); // invoke-virtual {p4, p3}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
			 /* .line 7 */
			 v2 = 			 java.lang.Math .max ( v2,v3 );
			 if ( p6 != null) { // if-eqz p6, :cond_1
				 /* .line 8 */
				 p0 = 				 (( androidx.recyclerview.widget.RecyclerView$a0 ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
				 /* sub-int/2addr p0, v2 */
				 /* add-int/lit8 p0, p0, -0x1 */
				 p0 = 				 java.lang.Math .max ( v1,p0 );
				 /* .line 9 */
			 } // :cond_1
			 p0 = 			 java.lang.Math .max ( v1,v0 );
		 } // :goto_0
		 /* if-nez p5, :cond_2 */
		 /* .line 10 */
	 } // :cond_2
	 p5 = 	 (( c.r.d.c0 ) p1 ).a ( p3 ); // invoke-virtual {p1, p3}, Lc/r/d/c0;->a(Landroid/view/View;)I
	 /* .line 11 */
	 p6 = 	 (( c.r.d.c0 ) p1 ).d ( p2 ); // invoke-virtual {p1, p2}, Lc/r/d/c0;->d(Landroid/view/View;)I
	 /* sub-int/2addr p5, p6 */
	 /* .line 12 */
	 p5 = 	 java.lang.Math .abs ( p5 );
	 /* .line 13 */
	 p6 = 	 (( androidx.recyclerview.widget.RecyclerView$o ) p4 ).l ( p2 ); // invoke-virtual {p4, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
	 /* .line 14 */
	 p3 = 	 (( androidx.recyclerview.widget.RecyclerView$o ) p4 ).l ( p3 ); // invoke-virtual {p4, p3}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
	 /* sub-int/2addr p6, p3 */
	 /* .line 15 */
	 p3 = 	 java.lang.Math .abs ( p6 );
	 /* add-int/lit8 p3, p3, 0x1 */
	 /* int-to-float p4, p5 */
	 /* int-to-float p3, p3 */
	 /* div-float/2addr p4, p3 */
	 /* int-to-float p0, p0 */
	 /* mul-float p0, p0, p4 */
	 /* .line 16 */
	 p3 = 	 (( c.r.d.c0 ) p1 ).f ( ); // invoke-virtual {p1}, Lc/r/d/c0;->f()I
	 /* .line 17 */
	 p1 = 	 (( c.r.d.c0 ) p1 ).d ( p2 ); // invoke-virtual {p1, p2}, Lc/r/d/c0;->d(Landroid/view/View;)I
	 /* sub-int/2addr p3, p1 */
	 /* int-to-float p1, p3 */
	 /* add-float/2addr p0, p1 */
	 /* .line 18 */
	 p0 = 	 java.lang.Math .round ( p0 );
} // :cond_3
} // :goto_1
} // .end method
public static Integer b ( androidx.recyclerview.widget.RecyclerView$a0 p0, c.r.d.c0 p1, android.view.View p2, android.view.View p3, androidx.recyclerview.widget.RecyclerView$o p4, Boolean p5 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p4 ).e ( ); // invoke-virtual {p4}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
if ( v0 != null) { // if-eqz v0, :cond_2
	 if ( p2 != null) { // if-eqz p2, :cond_2
		 /* if-nez p3, :cond_0 */
	 } // :cond_0
	 /* if-nez p5, :cond_1 */
	 /* .line 2 */
	 p0 = 	 (( androidx.recyclerview.widget.RecyclerView$a0 ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
	 /* .line 3 */
} // :cond_1
p5 = (( c.r.d.c0 ) p1 ).a ( p3 ); // invoke-virtual {p1, p3}, Lc/r/d/c0;->a(Landroid/view/View;)I
/* .line 4 */
p1 = (( c.r.d.c0 ) p1 ).d ( p2 ); // invoke-virtual {p1, p2}, Lc/r/d/c0;->d(Landroid/view/View;)I
/* sub-int/2addr p5, p1 */
/* .line 5 */
p1 = (( androidx.recyclerview.widget.RecyclerView$o ) p4 ).l ( p2 ); // invoke-virtual {p4, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
/* .line 6 */
p2 = (( androidx.recyclerview.widget.RecyclerView$o ) p4 ).l ( p3 ); // invoke-virtual {p4, p3}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
/* sub-int/2addr p1, p2 */
/* .line 7 */
p1 = java.lang.Math .abs ( p1 );
/* add-int/lit8 p1, p1, 0x1 */
/* int-to-float p2, p5 */
/* int-to-float p1, p1 */
/* div-float/2addr p2, p1 */
/* .line 8 */
p0 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
/* int-to-float p0, p0 */
/* mul-float p2, p2, p0 */
/* float-to-int p0, p2 */
} // :cond_2
} // :goto_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
