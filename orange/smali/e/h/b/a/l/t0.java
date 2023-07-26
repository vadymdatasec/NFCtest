public abstract class e.h.b.a.l.t0 extends c.b.k.r {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.widget.TextView q;
	 public android.widget.TextView r;
	 public e.h.b.a.m.d s;
	 /* # direct methods */
	 public e.h.b.a.l.t0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/b/k/r;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.widget.CompoundButton p0, Boolean p1 ) { //synthethic
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = this.s;
		 (( e.h.b.a.m.d ) p1 ).d ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;
		 v0 = this.s;
		 (( e.h.b.a.m.d ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;
		 com.orange.oab.contactless.packid.service.ZoneDetectionNotification .saveAutorisedValue ( p0,p1,v0,p2 );
		 return;
	 } // .end method
	 public void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-super {p0, p1}, Lc/b/k/r;->onCreate(Landroid/os/Bundle;)V */
		 /* .line 2 */
		 p1 = 		 (( e.h.b.a.l.t0 ) p0 ).s ( ); // invoke-virtual {p0}, Le/h/b/a/l/t0;->s()I
		 (( c.b.k.r ) p0 ).setContentView ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->setContentView(I)V
		 /* const p1, 0x7f08016b */
		 /* .line 3 */
		 (( c.b.k.r ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
		 /* check-cast p1, Landroidx/appcompat/widget/Toolbar; */
		 /* .line 4 */
		 (( c.b.k.r ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->a(Landroidx/appcompat/widget/Toolbar;)V
		 /* .line 5 */
		 (( c.b.k.r ) p0 ).p ( ); // invoke-virtual {p0}, Lc/b/k/r;->p()Lc/b/k/a;
		 int v1 = 1; // const/4 v1, 0x1
		 (( c.b.k.a ) v0 ).d ( v1 ); // invoke-virtual {v0, v1}, Lc/b/k/a;->d(Z)V
		 /* const v0, 0x7f050026 */
		 /* .line 6 */
		 v1 = 		 c.h.f.f .a ( p0,v0 );
		 (( android.view.ViewGroup ) p1 ).setBackgroundColor ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setBackgroundColor(I)V
		 /* .line 7 */
		 /* const/16 v1, 0x15 */
		 /* if-lt p1, v1, :cond_0 */
		 /* .line 8 */
		 (( android.app.Activity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
		 v0 = 		 c.h.f.f .a ( p0,v0 );
		 (( android.view.Window ) p1 ).setStatusBarColor ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/Window;->setStatusBarColor(I)V
	 } // :cond_0
	 /* const p1, 0x7f08017b */
	 /* .line 9 */
	 (( c.b.k.r ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
	 /* check-cast p1, Landroid/widget/TextView; */
	 this.r = p1;
	 /* const p1, 0x7f080178 */
	 /* .line 10 */
	 (( c.b.k.r ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
	 /* check-cast p1, Landroid/widget/TextView; */
	 this.q = p1;
	 /* .line 11 */
	 (( android.app.Activity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
	 (( android.content.Intent ) p1 ).getExtras ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
	 if ( p1 != null) { // if-eqz p1, :cond_2
		 final String v0 = "BADGE"; // const-string v0, "BADGE"
		 /* .line 12 */
		 (( android.os.Bundle ) p1 ).getSerializable ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;
		 /* check-cast p1, Le/h/b/a/m/d; */
		 this.s = p1;
		 /* .line 13 */
		 v0 = this.q;
		 (( e.h.b.a.m.d ) p1 ).f ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->f()Ljava/lang/String;
		 (( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
		 /* .line 14 */
		 p1 = this.r;
		 v0 = this.s;
		 (( e.h.b.a.m.d ) v0 ).i ( ); // invoke-virtual {v0}, Le/h/b/a/m/d;->i()Ljava/lang/String;
		 (( android.widget.TextView ) p1 ).setText ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
		 /* .line 15 */
		 p1 = this.s;
		 p1 = 		 (( e.h.b.a.m.d ) p1 ).t ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->t()Z
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 /* const p1, 0x7f08017a */
			 /* .line 16 */
			 (( c.b.k.r ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
			 /* check-cast p1, Landroid/widget/TextView; */
			 /* .line 17 */
			 v0 = this.s;
			 (( e.h.b.a.m.d ) v0 ).h ( ); // invoke-virtual {v0}, Le/h/b/a/m/d;->h()Ljava/lang/String;
			 (( android.widget.TextView ) p1 ).setText ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
		 } // :cond_1
		 /* const p1, 0x7f080057 */
		 /* .line 18 */
		 (( c.b.k.r ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
		 /* check-cast p1, Landroid/widget/ImageView; */
		 /* .line 19 */
		 v0 = this.s;
		 (( e.h.b.a.m.d ) v0 ).d ( p1 ); // invoke-virtual {v0, p1}, Le/h/b/a/m/d;->d(Landroid/widget/ImageView;)V
		 /* .line 20 */
		 p1 = this.s;
		 /* const v0, 0x7f080179 */
		 (( c.b.k.r ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/TextView; */
		 (( e.h.b.a.m.d ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/h/b/a/m/d;->a(Landroid/widget/TextView;)V
		 /* .line 21 */
	 } // :cond_2
	 p1 = this.s;
	 p1 = 	 (( e.h.b.a.m.d ) p1 ).y ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->y()Z
	 if ( p1 != null) { // if-eqz p1, :cond_3
		 /* const p1, 0x7f0800d9 */
		 /* .line 22 */
		 (( c.b.k.r ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 23 */
		 (( android.view.View ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V
		 /* const p1, 0x7f080148 */
		 /* .line 24 */
		 (( c.b.k.r ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
		 /* check-cast p1, Landroid/widget/Switch; */
		 /* .line 25 */
		 v0 = this.s;
		 (( e.h.b.a.m.d ) v0 ).d ( ); // invoke-virtual {v0}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;
		 v1 = this.s;
		 (( e.h.b.a.m.d ) v1 ).a ( ); // invoke-virtual {v1}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;
		 v0 = 		 com.orange.oab.contactless.packid.service.ZoneDetectionNotification .isAutorised ( p0,v0,v1 );
		 (( android.widget.Switch ) p1 ).setChecked ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/Switch;->setChecked(Z)V
		 /* .line 26 */
		 /* new-instance v0, Le/h/b/a/l/b; */
		 /* invoke-direct {v0, p0}, Le/h/b/a/l/b;-><init>(Le/h/b/a/l/t0;)V */
		 (( android.widget.Switch ) p1 ).setOnCheckedChangeListener ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
	 } // :cond_3
	 return;
} // .end method
public Boolean onNavigateUp ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 (( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
	 int v0 = 1; // const/4 v0, 0x1
} // .end method
public abstract Integer s ( ) {
} // .end method
