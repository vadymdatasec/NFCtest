public abstract class c.v.b {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static void a ( android.animation.Animator p0 ) {
		 /* .locals 5 */
		 /* .line 3 */
		 /* const/16 v1, 0x13 */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 4 */
		 (( android.animation.Animator ) p0 ).pause ( ); // invoke-virtual {p0}, Landroid/animation/Animator;->pause()V
		 /* .line 5 */
	 } // :cond_0
	 (( android.animation.Animator ) p0 ).getListeners ( ); // invoke-virtual {p0}, Landroid/animation/Animator;->getListeners()Ljava/util/ArrayList;
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 6 */
		 v2 = 		 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
	 } // :goto_0
	 /* if-ge v1, v2, :cond_2 */
	 /* .line 7 */
	 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v3, Landroid/animation/Animator$AnimatorListener; */
	 /* .line 8 */
	 /* instance-of v4, v3, Lc/v/a; */
	 if ( v4 != null) { // if-eqz v4, :cond_1
		 /* .line 9 */
		 /* check-cast v3, Lc/v/a; */
	 } // :cond_1
	 /* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
} // :goto_1
return;
} // .end method
public static void a ( android.animation.Animator p0, android.animation.AnimatorListenerAdapter p1 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
(( android.animation.Animator ) p0 ).addPauseListener ( p1 ); // invoke-virtual {p0, p1}, Landroid/animation/Animator;->addPauseListener(Landroid/animation/Animator$AnimatorPauseListener;)V
} // :cond_0
return;
} // .end method
public static void b ( android.animation.Animator p0 ) {
/* .locals 5 */
/* .line 1 */
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
(( android.animation.Animator ) p0 ).resume ( ); // invoke-virtual {p0}, Landroid/animation/Animator;->resume()V
/* .line 3 */
} // :cond_0
(( android.animation.Animator ) p0 ).getListeners ( ); // invoke-virtual {p0}, Landroid/animation/Animator;->getListeners()Ljava/util/ArrayList;
if ( v0 != null) { // if-eqz v0, :cond_2
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
v2 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
} // :goto_0
/* if-ge v1, v2, :cond_2 */
/* .line 5 */
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Landroid/animation/Animator$AnimatorListener; */
/* .line 6 */
/* instance-of v4, v3, Lc/v/a; */
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 7 */
/* check-cast v3, Lc/v/a; */
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
} // :goto_1
return;
} // .end method
