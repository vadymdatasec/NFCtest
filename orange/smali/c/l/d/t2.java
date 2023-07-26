public class c.l.d.t2 extends c.l.d.x2 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public c.l.d.t2 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/l/d/x2;-><init>()V */
		 return;
	 } // .end method
	 public static Boolean a ( android.transition.Transition p0 ) {
		 /* .locals 1 */
		 /* .line 13 */
		 (( android.transition.Transition ) p0 ).getTargetIds ( ); // invoke-virtual {p0}, Landroid/transition/Transition;->getTargetIds()Ljava/util/List;
		 v0 = 		 c.l.d.x2 .a ( v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 14 */
			 (( android.transition.Transition ) p0 ).getTargetNames ( ); // invoke-virtual {p0}, Landroid/transition/Transition;->getTargetNames()Ljava/util/List;
			 v0 = 			 c.l.d.x2 .a ( v0 );
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 15 */
				 (( android.transition.Transition ) p0 ).getTargetTypes ( ); // invoke-virtual {p0}, Landroid/transition/Transition;->getTargetTypes()Ljava/util/List;
				 p0 = 				 c.l.d.x2 .a ( p0 );
				 /* if-nez p0, :cond_0 */
			 } // :cond_0
			 int p0 = 0; // const/4 p0, 0x0
		 } // :cond_1
	 } // :goto_0
	 int p0 = 1; // const/4 p0, 0x1
} // :goto_1
} // .end method
/* # virtual methods */
public java.lang.Object a ( java.lang.Object p0, java.lang.Object p1, java.lang.Object p2 ) {
/* .locals 1 */
/* .line 18 */
/* check-cast p1, Landroid/transition/Transition; */
/* .line 19 */
/* check-cast p2, Landroid/transition/Transition; */
/* .line 20 */
/* check-cast p3, Landroid/transition/Transition; */
if ( p1 != null) { // if-eqz p1, :cond_0
	 if ( p2 != null) { // if-eqz p2, :cond_0
		 /* .line 21 */
		 /* new-instance v0, Landroid/transition/TransitionSet; */
		 /* invoke-direct {v0}, Landroid/transition/TransitionSet;-><init>()V */
		 /* .line 22 */
		 (( android.transition.TransitionSet ) v0 ).addTransition ( p1 ); // invoke-virtual {v0, p1}, Landroid/transition/TransitionSet;->addTransition(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
		 /* .line 23 */
		 (( android.transition.TransitionSet ) p1 ).addTransition ( p2 ); // invoke-virtual {p1, p2}, Landroid/transition/TransitionSet;->addTransition(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
		 int p2 = 1; // const/4 p2, 0x1
		 /* .line 24 */
		 (( android.transition.TransitionSet ) p1 ).setOrdering ( p2 ); // invoke-virtual {p1, p2}, Landroid/transition/TransitionSet;->setOrdering(I)Landroid/transition/TransitionSet;
	 } // :cond_0
	 if ( p1 != null) { // if-eqz p1, :cond_1
	 } // :cond_1
	 if ( p2 != null) { // if-eqz p2, :cond_2
		 /* move-object p1, p2 */
	 } // :cond_2
	 int p1 = 0; // const/4 p1, 0x0
} // :goto_0
if ( p3 != null) { // if-eqz p3, :cond_4
	 /* .line 25 */
	 /* new-instance p2, Landroid/transition/TransitionSet; */
	 /* invoke-direct {p2}, Landroid/transition/TransitionSet;-><init>()V */
	 if ( p1 != null) { // if-eqz p1, :cond_3
		 /* .line 26 */
		 (( android.transition.TransitionSet ) p2 ).addTransition ( p1 ); // invoke-virtual {p2, p1}, Landroid/transition/TransitionSet;->addTransition(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
		 /* .line 27 */
	 } // :cond_3
	 (( android.transition.TransitionSet ) p2 ).addTransition ( p3 ); // invoke-virtual {p2, p3}, Landroid/transition/TransitionSet;->addTransition(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
} // :cond_4
} // .end method
public void a ( android.view.ViewGroup p0, java.lang.Object p1 ) {
/* .locals 0 */
/* .line 28 */
/* check-cast p2, Landroid/transition/Transition; */
android.transition.TransitionManager .beginDelayedTransition ( p1,p2 );
return;
} // .end method
public void a ( androidx.fragment.app.Fragment p0, java.lang.Object p1, Object p2, java.lang.Runnable p3 ) {
/* .locals 0 */
/* .line 31 */
/* check-cast p2, Landroid/transition/Transition; */
/* new-instance p1, Lc/l/d/r2; */
/* invoke-direct {p1, p0, p4}, Lc/l/d/r2;-><init>(Lc/l/d/t2;Ljava/lang/Runnable;)V */
(( android.transition.Transition ) p2 ).addListener ( p1 ); // invoke-virtual {p2, p1}, Landroid/transition/Transition;->addListener(Landroid/transition/Transition$TransitionListener;)Landroid/transition/Transition;
return;
} // .end method
public void a ( java.lang.Object p0, android.graphics.Rect p1 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* .line 48 */
	 /* check-cast p1, Landroid/transition/Transition; */
	 /* .line 49 */
	 /* new-instance v0, Lc/l/d/s2; */
	 /* invoke-direct {v0, p0, p2}, Lc/l/d/s2;-><init>(Lc/l/d/t2;Landroid/graphics/Rect;)V */
	 (( android.transition.Transition ) p1 ).setEpicenterCallback ( v0 ); // invoke-virtual {p1, v0}, Landroid/transition/Transition;->setEpicenterCallback(Landroid/transition/Transition$EpicenterCallback;)V
} // :cond_0
return;
} // .end method
public void a ( java.lang.Object p0, android.view.View p1 ) {
/* .locals 0 */
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* .line 46 */
	 /* check-cast p1, Landroid/transition/Transition; */
	 /* .line 47 */
	 (( android.transition.Transition ) p1 ).addTarget ( p2 ); // invoke-virtual {p1, p2}, Landroid/transition/Transition;->addTarget(Landroid/view/View;)Landroid/transition/Transition;
} // :cond_0
return;
} // .end method
public void a ( java.lang.Object p0, android.view.View p1, java.util.ArrayList p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Object;", */
/* "Landroid/view/View;", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 16 */
/* check-cast p1, Landroid/transition/Transition; */
/* .line 17 */
/* new-instance v0, Lc/l/d/p2; */
/* invoke-direct {v0, p0, p2, p3}, Lc/l/d/p2;-><init>(Lc/l/d/t2;Landroid/view/View;Ljava/util/ArrayList;)V */
(( android.transition.Transition ) p1 ).addListener ( v0 ); // invoke-virtual {p1, v0}, Landroid/transition/Transition;->addListener(Landroid/transition/Transition$TransitionListener;)Landroid/transition/Transition;
return;
} // .end method
public void a ( java.lang.Object p0, java.lang.Object p1, java.util.ArrayList p2, java.lang.Object p3, java.util.ArrayList p4, java.lang.Object p5, java.util.ArrayList p6 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Object;", */
/* "Ljava/lang/Object;", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;", */
/* "Ljava/lang/Object;", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;", */
/* "Ljava/lang/Object;", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 29 */
/* move-object v0, p1 */
/* check-cast v0, Landroid/transition/Transition; */
/* .line 30 */
/* new-instance v9, Lc/l/d/q2; */
/* move-object v1, v9 */
/* move-object v2, p0 */
/* move-object v3, p2 */
/* move-object v4, p3 */
/* move-object v5, p4 */
/* move-object v6, p5 */
/* move-object/from16 v7, p6 */
/* move-object/from16 v8, p7 */
/* invoke-direct/range {v1 ..v8}, Lc/l/d/q2;-><init>(Lc/l/d/t2;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V */
(( android.transition.Transition ) v0 ).addListener ( v9 ); // invoke-virtual {v0, v9}, Landroid/transition/Transition;->addListener(Landroid/transition/Transition$TransitionListener;)Landroid/transition/Transition;
return;
} // .end method
public void a ( java.lang.Object p0, java.util.ArrayList p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Object;", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 2 */
/* check-cast p1, Landroid/transition/Transition; */
/* if-nez p1, :cond_0 */
return;
/* .line 3 */
} // :cond_0
/* instance-of v0, p1, Landroid/transition/TransitionSet; */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
/* check-cast p1, Landroid/transition/TransitionSet; */
/* .line 5 */
v0 = (( android.transition.TransitionSet ) p1 ).getTransitionCount ( ); // invoke-virtual {p1}, Landroid/transition/TransitionSet;->getTransitionCount()I
} // :goto_0
/* if-ge v1, v0, :cond_2 */
/* .line 6 */
(( android.transition.TransitionSet ) p1 ).getTransitionAt ( v1 ); // invoke-virtual {p1, v1}, Landroid/transition/TransitionSet;->getTransitionAt(I)Landroid/transition/Transition;
/* .line 7 */
(( c.l.d.t2 ) p0 ).a ( v2, p2 ); // invoke-virtual {p0, v2, p2}, Lc/l/d/t2;->a(Ljava/lang/Object;Ljava/util/ArrayList;)V
/* add-int/lit8 v1, v1, 0x1 */
/* .line 8 */
} // :cond_1
v0 = c.l.d.t2 .a ( p1 );
/* if-nez v0, :cond_2 */
/* .line 9 */
(( android.transition.Transition ) p1 ).getTargets ( ); // invoke-virtual {p1}, Landroid/transition/Transition;->getTargets()Ljava/util/List;
/* .line 10 */
v0 = c.l.d.x2 .a ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 11 */
v0 = (( java.util.ArrayList ) p2 ).size ( ); // invoke-virtual {p2}, Ljava/util/ArrayList;->size()I
} // :goto_1
/* if-ge v1, v0, :cond_2 */
/* .line 12 */
(( java.util.ArrayList ) p2 ).get ( v1 ); // invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/view/View; */
(( android.transition.Transition ) p1 ).addTarget ( v2 ); // invoke-virtual {p1, v2}, Landroid/transition/Transition;->addTarget(Landroid/view/View;)Landroid/transition/Transition;
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
return;
} // .end method
public void a ( java.lang.Object p0, java.util.ArrayList p1, java.util.ArrayList p2 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Object;", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 32 */
/* check-cast p1, Landroid/transition/Transition; */
/* .line 33 */
/* instance-of v0, p1, Landroid/transition/TransitionSet; */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 34 */
/* check-cast p1, Landroid/transition/TransitionSet; */
/* .line 35 */
v0 = (( android.transition.TransitionSet ) p1 ).getTransitionCount ( ); // invoke-virtual {p1}, Landroid/transition/TransitionSet;->getTransitionCount()I
} // :goto_0
/* if-ge v1, v0, :cond_3 */
/* .line 36 */
(( android.transition.TransitionSet ) p1 ).getTransitionAt ( v1 ); // invoke-virtual {p1, v1}, Landroid/transition/TransitionSet;->getTransitionAt(I)Landroid/transition/Transition;
/* .line 37 */
(( c.l.d.t2 ) p0 ).a ( v2, p2, p3 ); // invoke-virtual {p0, v2, p2, p3}, Lc/l/d/t2;->a(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
/* add-int/lit8 v1, v1, 0x1 */
/* .line 38 */
} // :cond_0
v0 = c.l.d.t2 .a ( p1 );
/* if-nez v0, :cond_3 */
/* .line 39 */
(( android.transition.Transition ) p1 ).getTargets ( ); // invoke-virtual {p1}, Landroid/transition/Transition;->getTargets()Ljava/util/List;
if ( v0 != null) { // if-eqz v0, :cond_3
v2 = /* .line 40 */
v3 = (( java.util.ArrayList ) p2 ).size ( ); // invoke-virtual {p2}, Ljava/util/ArrayList;->size()I
/* if-ne v2, v3, :cond_3 */
v0 = /* .line 41 */
if ( v0 != null) { // if-eqz v0, :cond_3
/* if-nez p3, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 42 */
} // :cond_1
v0 = (( java.util.ArrayList ) p3 ).size ( ); // invoke-virtual {p3}, Ljava/util/ArrayList;->size()I
} // :goto_1
/* if-ge v1, v0, :cond_2 */
/* .line 43 */
(( java.util.ArrayList ) p3 ).get ( v1 ); // invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/view/View; */
(( android.transition.Transition ) p1 ).addTarget ( v2 ); // invoke-virtual {p1, v2}, Landroid/transition/Transition;->addTarget(Landroid/view/View;)Landroid/transition/Transition;
/* add-int/lit8 v1, v1, 0x1 */
/* .line 44 */
} // :cond_2
p3 = (( java.util.ArrayList ) p2 ).size ( ); // invoke-virtual {p2}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 p3, p3, -0x1 */
} // :goto_2
/* if-ltz p3, :cond_3 */
/* .line 45 */
(( java.util.ArrayList ) p2 ).get ( p3 ); // invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
(( android.transition.Transition ) p1 ).removeTarget ( v0 ); // invoke-virtual {p1, v0}, Landroid/transition/Transition;->removeTarget(Landroid/view/View;)Landroid/transition/Transition;
/* add-int/lit8 p3, p3, -0x1 */
} // :cond_3
return;
} // .end method
public Boolean a ( java.lang.Object p0 ) {
/* .locals 0 */
/* .line 1 */
/* instance-of p1, p1, Landroid/transition/Transition; */
} // .end method
public java.lang.Object b ( java.lang.Object p0 ) {
/* .locals 0 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
/* check-cast p1, Landroid/transition/Transition; */
(( android.transition.Transition ) p1 ).clone ( ); // invoke-virtual {p1}, Landroid/transition/Transition;->clone()Landroid/transition/Transition;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public java.lang.Object b ( java.lang.Object p0, java.lang.Object p1, java.lang.Object p2 ) {
/* .locals 1 */
/* .line 11 */
/* new-instance v0, Landroid/transition/TransitionSet; */
/* invoke-direct {v0}, Landroid/transition/TransitionSet;-><init>()V */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 12 */
/* check-cast p1, Landroid/transition/Transition; */
(( android.transition.TransitionSet ) v0 ).addTransition ( p1 ); // invoke-virtual {v0, p1}, Landroid/transition/TransitionSet;->addTransition(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
} // :cond_0
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 13 */
/* check-cast p2, Landroid/transition/Transition; */
(( android.transition.TransitionSet ) v0 ).addTransition ( p2 ); // invoke-virtual {v0, p2}, Landroid/transition/TransitionSet;->addTransition(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
} // :cond_1
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 14 */
/* check-cast p3, Landroid/transition/Transition; */
(( android.transition.TransitionSet ) v0 ).addTransition ( p3 ); // invoke-virtual {v0, p3}, Landroid/transition/TransitionSet;->addTransition(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
} // :cond_2
} // .end method
public void b ( java.lang.Object p0, android.view.View p1 ) {
/* .locals 0 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 19 */
/* check-cast p1, Landroid/transition/Transition; */
/* .line 20 */
(( android.transition.Transition ) p1 ).removeTarget ( p2 ); // invoke-virtual {p1, p2}, Landroid/transition/Transition;->removeTarget(Landroid/view/View;)Landroid/transition/Transition;
} // :cond_0
return;
} // .end method
public void b ( java.lang.Object p0, android.view.View p1, java.util.ArrayList p2 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Object;", */
/* "Landroid/view/View;", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 2 */
/* check-cast p1, Landroid/transition/TransitionSet; */
/* .line 3 */
(( android.transition.TransitionSet ) p1 ).getTargets ( ); // invoke-virtual {p1}, Landroid/transition/TransitionSet;->getTargets()Ljava/util/List;
/* .line 4 */
/* .line 5 */
v1 = (( java.util.ArrayList ) p3 ).size ( ); // invoke-virtual {p3}, Ljava/util/ArrayList;->size()I
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_0 */
/* .line 6 */
(( java.util.ArrayList ) p3 ).get ( v2 ); // invoke-virtual {p3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Landroid/view/View; */
/* .line 7 */
c.l.d.x2 .a ( v0,v3 );
/* add-int/lit8 v2, v2, 0x1 */
/* .line 8 */
} // :cond_0
/* .line 9 */
(( java.util.ArrayList ) p3 ).add ( p2 ); // invoke-virtual {p3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 10 */
(( c.l.d.t2 ) p0 ).a ( p1, p3 ); // invoke-virtual {p0, p1, p3}, Lc/l/d/t2;->a(Ljava/lang/Object;Ljava/util/ArrayList;)V
return;
} // .end method
public void b ( java.lang.Object p0, java.util.ArrayList p1, java.util.ArrayList p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Object;", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 15 */
/* check-cast p1, Landroid/transition/TransitionSet; */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 16 */
(( android.transition.TransitionSet ) p1 ).getTargets ( ); // invoke-virtual {p1}, Landroid/transition/TransitionSet;->getTargets()Ljava/util/List;
/* .line 17 */
(( android.transition.TransitionSet ) p1 ).getTargets ( ); // invoke-virtual {p1}, Landroid/transition/TransitionSet;->getTargets()Ljava/util/List;
/* .line 18 */
(( c.l.d.t2 ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lc/l/d/t2;->a(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
} // :cond_0
return;
} // .end method
public java.lang.Object c ( java.lang.Object p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 1 */
} // :cond_0
/* new-instance v0, Landroid/transition/TransitionSet; */
/* invoke-direct {v0}, Landroid/transition/TransitionSet;-><init>()V */
/* .line 2 */
/* check-cast p1, Landroid/transition/Transition; */
(( android.transition.TransitionSet ) v0 ).addTransition ( p1 ); // invoke-virtual {v0, p1}, Landroid/transition/TransitionSet;->addTransition(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
} // .end method
public void c ( java.lang.Object p0, android.view.View p1 ) {
/* .locals 1 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 3 */
/* check-cast p1, Landroid/transition/Transition; */
/* .line 4 */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
/* .line 5 */
(( c.l.d.x2 ) p0 ).a ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Lc/l/d/x2;->a(Landroid/view/View;Landroid/graphics/Rect;)V
/* .line 6 */
/* new-instance p2, Lc/l/d/o2; */
/* invoke-direct {p2, p0, v0}, Lc/l/d/o2;-><init>(Lc/l/d/t2;Landroid/graphics/Rect;)V */
(( android.transition.Transition ) p1 ).setEpicenterCallback ( p2 ); // invoke-virtual {p1, p2}, Landroid/transition/Transition;->setEpicenterCallback(Landroid/transition/Transition$EpicenterCallback;)V
} // :cond_0
return;
} // .end method
