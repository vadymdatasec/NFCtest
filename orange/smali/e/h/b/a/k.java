public abstract class e.h.b.a.k {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static e.e.a.q a ( android.view.View p0, Integer p1, Integer p2 ) {
		 /* .locals 2 */
		 /* .line 20 */
		 /* new-instance v0, Le/e/a/q; */
		 (( android.view.View ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
		 /* check-cast v1, Landroid/app/Activity; */
		 /* invoke-direct {v0, v1}, Le/e/a/q;-><init>(Landroid/app/Activity;)V */
		 /* .line 21 */
		 (( android.view.View ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
		 (( android.content.Context ) v1 ).getString ( p1 ); // invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
		 (( e.e.a.q ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Le/e/a/q;->c(Ljava/lang/String;)Le/e/a/q;
		 /* .line 22 */
		 (( android.view.View ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
		 (( android.content.Context ) p1 ).getString ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;
		 (( e.e.a.q ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/e/a/q;->a(Ljava/lang/String;)Le/e/a/q;
		 /* .line 23 */
		 (( android.view.View ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
		 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 /* const p2, 0x7f050026 */
		 int v1 = 0; // const/4 v1, 0x0
		 p1 = 		 (( android.content.res.Resources ) p1 ).getColor ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I
		 (( e.e.a.q ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/e/a/q;->a(I)Le/e/a/q;
		 /* .line 24 */
		 (( android.view.View ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
		 /* const p2, 0x7f0e011f */
		 (( android.content.Context ) p1 ).getString ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;
		 (( e.e.a.q ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/e/a/q;->b(Ljava/lang/String;)Le/e/a/q;
		 /* new-instance p1, Le/h/b/a/j; */
		 /* invoke-direct {p1}, Le/h/b/a/j;-><init>()V */
		 /* .line 25 */
		 (( e.e.a.q ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/e/a/q;->a(Le/e/a/r;)Le/e/a/q;
		 /* .line 26 */
		 (( e.e.a.q ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Le/e/a/q;->a(Landroid/view/View;)Le/e/a/q;
	 } // .end method
	 public static void a ( e.h.b.a.l.y0 p0, android.view.View p1, androidx.recyclerview.widget.RecyclerView p2 ) {
		 /* .locals 13 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 1 */
		 (( e.h.b.a.l.y0 ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Le/h/b/a/l/y0;->d(I)Le/h/b/a/m/d;
		 /* .line 2 */
		 (( androidx.recyclerview.widget.RecyclerView ) p2 ).c ( v0 ); // invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->c(I)Landroidx/recyclerview/widget/RecyclerView$d0;
		 /* check-cast v1, Le/h/b/a/m/e; */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 3 */
		 (( androidx.recyclerview.widget.RecyclerView ) p2 ).c ( v2 ); // invoke-virtual {p2, v2}, Landroidx/recyclerview/widget/RecyclerView;->c(I)Landroidx/recyclerview/widget/RecyclerView$d0;
		 /* check-cast p2, Le/h/b/a/m/f; */
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 if ( p0 != null) { // if-eqz p0, :cond_1
				 if ( p2 != null) { // if-eqz p2, :cond_1
					 /* const v3, 0x7f0e011b */
					 /* const v4, 0x7f0e011c */
					 /* .line 4 */
					 e.h.b.a.k .a ( p1,v3,v4 );
					 /* .line 5 */
					 p2 = this.a;
					 /* const v3, 0x7f0e014e */
					 /* const v4, 0x7f0e014f */
					 e.h.b.a.k .a ( p2,v3,v4 );
					 /* .line 6 */
					 (( e.h.b.a.m.e ) v1 ).G ( ); // invoke-virtual {v1}, Le/h/b/a/m/e;->G()Lcom/orange/hce/proto/activity/StateImageButton;
					 /* const v4, 0x7f0e0057 */
					 /* const v5, 0x7f0e0056 */
					 e.h.b.a.k .a ( v3,v4,v5 );
					 /* .line 7 */
					 (( e.h.b.a.m.e ) v1 ).G ( ); // invoke-virtual {v1}, Le/h/b/a/m/e;->G()Lcom/orange/hce/proto/activity/StateImageButton;
					 /* const v5, 0x7f0e00d5 */
					 /* const v6, 0x7f0e00d6 */
					 e.h.b.a.k .a ( v4,v5,v6 );
					 /* .line 8 */
					 v5 = this.a;
					 /* const v6, 0x7f0e003a */
					 /* const v7, 0x7f0e0042 */
					 e.h.b.a.k .a ( v5,v6,v7 );
					 /* .line 9 */
					 (( e.h.b.a.m.e ) v1 ).E ( ); // invoke-virtual {v1}, Le/h/b/a/m/e;->E()Landroid/widget/ImageView;
					 /* const v7, 0x7f0e0044 */
					 /* const v8, 0x7f0e0045 */
					 e.h.b.a.k .a ( v6,v7,v8 );
					 /* .line 10 */
					 (( e.h.b.a.m.e ) v1 ).P ( ); // invoke-virtual {v1}, Le/h/b/a/m/e;->P()Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;
					 /* const v8, 0x7f0e011d */
					 /* const v9, 0x7f0e011e */
					 e.h.b.a.k .a ( v7,v8,v9 );
					 /* .line 11 */
					 (( e.h.b.a.m.e ) v1 ).I ( ); // invoke-virtual {v1}, Le/h/b/a/m/e;->I()Lcom/orange/hce/proto/activity/StateImageButton;
					 /* const v9, 0x7f0e00aa */
					 /* const v10, 0x7f0e00ab */
					 e.h.b.a.k .a ( v8,v9,v10 );
					 /* .line 12 */
					 (( e.h.b.a.m.e ) v1 ).O ( ); // invoke-virtual {v1}, Le/h/b/a/m/e;->O()Lcom/orange/hce/proto/activity/StateImageButton;
					 /* const v10, 0x7f0e017e */
					 /* const v11, 0x7f0e017f */
					 e.h.b.a.k .a ( v9,v10,v11 );
					 /* .line 13 */
					 (( e.h.b.a.m.e ) v1 ).K ( ); // invoke-virtual {v1}, Le/h/b/a/m/e;->K()Landroid/widget/ImageButton;
					 /* const v10, 0x7f0e00b8 */
					 /* const v11, 0x7f0e00b9 */
					 e.h.b.a.k .a ( v1,v10,v11 );
					 /* .line 14 */
					 /* new-instance v10, Le/e/a/t; */
					 /* invoke-direct {v10}, Le/e/a/t;-><init>()V */
					 int v11 = 4; // const/4 v11, 0x4
					 /* new-array v12, v11, [Le/e/a/q; */
					 /* aput-object p1, v12, v2 */
					 /* aput-object p2, v12, v0 */
					 int p1 = 2; // const/4 p1, 0x2
					 /* aput-object v5, v12, p1 */
					 int p2 = 3; // const/4 p2, 0x3
					 /* aput-object v6, v12, p2 */
					 /* .line 15 */
					 e.f.b.b.k .a ( v12 );
					 /* .line 16 */
					 p0 = 					 (( e.h.b.a.m.d ) p0 ).z ( ); // invoke-virtual {p0}, Le/h/b/a/m/d;->z()Z
					 if ( p0 != null) { // if-eqz p0, :cond_0
						 /* new-array p0, v11, [Le/e/a/q; */
						 /* aput-object v4, p0, v2 */
						 /* aput-object v9, p0, v0 */
						 /* aput-object v8, p0, p1 */
						 /* aput-object v1, p0, p2 */
						 /* .line 17 */
						 e.f.b.b.k .a ( p0 );
						 (( java.util.ArrayList ) v5 ).addAll ( p0 ); // invoke-virtual {v5, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
					 } // :cond_0
					 int p0 = 5; // const/4 p0, 0x5
					 /* new-array p0, p0, [Le/e/a/q; */
					 /* aput-object v7, p0, v2 */
					 /* aput-object v3, p0, v0 */
					 /* aput-object v9, p0, p1 */
					 /* aput-object v8, p0, p2 */
					 /* aput-object v1, p0, v11 */
					 /* .line 18 */
					 e.f.b.b.k .a ( p0 );
					 (( java.util.ArrayList ) v5 ).addAll ( p0 ); // invoke-virtual {v5, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
					 /* .line 19 */
				 } // :goto_0
				 (( e.e.a.t ) v10 ).a ( v5 ); // invoke-virtual {v10, v5}, Le/e/a/t;->a(Ljava/util/List;)Le/e/a/t;
				 (( e.e.a.t ) v10 ).a ( ); // invoke-virtual {v10}, Le/e/a/t;->a()V
			 } // :cond_1
			 return;
		 } // .end method
