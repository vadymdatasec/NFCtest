public class c.l.d.d3 extends c.l.d.h3 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.l.d.a2 h;
	 /* # direct methods */
	 public c.l.d.d3 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( c.l.d.a2 ) p3 ).k ( ); // invoke-virtual {p3}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;
		 /* invoke-direct {p0, p1, p2, v0, p4}, Lc/l/d/h3;-><init>(Lc/l/d/g3;Lc/l/d/f3;Landroidx/fragment/app/Fragment;Lc/h/j/c;)V */
		 /* .line 2 */
		 this.h = p3;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-super {p0}, Lc/l/d/h3;->b()V */
		 /* .line 2 */
		 v0 = this.h;
		 (( c.l.d.a2 ) v0 ).l ( ); // invoke-virtual {v0}, Lc/l/d/a2;->l()V
		 return;
	 } // .end method
	 public void h ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 (( c.l.d.h3 ) p0 ).e ( ); // invoke-virtual {p0}, Lc/l/d/h3;->e()Lc/l/d/f3;
		 v1 = c.l.d.f3.c;
		 /* if-ne v0, v1, :cond_3 */
		 /* .line 2 */
		 v0 = this.h;
		 (( c.l.d.a2 ) v0 ).k ( ); // invoke-virtual {v0}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;
		 /* .line 3 */
		 v1 = this.I;
		 (( android.view.View ) v1 ).findFocus ( ); // invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 4 */
			 (( androidx.fragment.app.Fragment ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->b(Landroid/view/View;)V
			 int v2 = 2; // const/4 v2, 0x2
			 /* .line 5 */
			 v2 = 			 c.l.d.o1 .d ( v2 );
			 if ( v2 != null) { // if-eqz v2, :cond_0
				 /* .line 6 */
				 /* new-instance v2, Ljava/lang/StringBuilder; */
				 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
				 final String v3 = "requestFocus: Saved focused view "; // const-string v3, "requestFocus: Saved focused view "
				 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
				 final String v1 = " for Fragment "; // const-string v1, " for Fragment "
				 (( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 final String v2 = "FragmentManager"; // const-string v2, "FragmentManager"
				 android.util.Log .v ( v2,v1 );
				 /* .line 7 */
			 } // :cond_0
			 (( c.l.d.h3 ) p0 ).d ( ); // invoke-virtual {p0}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;
			 (( androidx.fragment.app.Fragment ) v1 ).w0 ( ); // invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->w0()Landroid/view/View;
			 /* .line 8 */
			 (( android.view.View ) v1 ).getParent ( ); // invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
			 int v3 = 0; // const/4 v3, 0x0
			 /* if-nez v2, :cond_1 */
			 /* .line 9 */
			 v2 = this.h;
			 (( c.l.d.a2 ) v2 ).b ( ); // invoke-virtual {v2}, Lc/l/d/a2;->b()V
			 /* .line 10 */
			 (( android.view.View ) v1 ).setAlpha ( v3 ); // invoke-virtual {v1, v3}, Landroid/view/View;->setAlpha(F)V
			 /* .line 11 */
		 } // :cond_1
		 v2 = 		 (( android.view.View ) v1 ).getAlpha ( ); // invoke-virtual {v1}, Landroid/view/View;->getAlpha()F
		 /* cmpl-float v2, v2, v3 */
		 /* if-nez v2, :cond_2 */
		 v2 = 		 (( android.view.View ) v1 ).getVisibility ( ); // invoke-virtual {v1}, Landroid/view/View;->getVisibility()I
		 /* if-nez v2, :cond_2 */
		 int v2 = 4; // const/4 v2, 0x4
		 /* .line 12 */
		 (( android.view.View ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V
		 /* .line 13 */
	 } // :cond_2
	 v0 = 	 (( androidx.fragment.app.Fragment ) v0 ).D ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->D()F
	 (( android.view.View ) v1 ).setAlpha ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V
} // :cond_3
return;
} // .end method
