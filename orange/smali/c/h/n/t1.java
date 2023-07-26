public abstract class c.h.n.t1 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( Integer p0 ) {
		 /* .locals 4 */
		 int v0 = 1; // const/4 v0, 0x1
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 1; // const/4 v2, 0x1
	 } // :goto_0
	 /* const/16 v3, 0x100 */
	 /* if-gt v2, v3, :cond_9 */
	 /* and-int v3, p0, v2 */
	 if ( v3 != null) { // if-eqz v3, :cond_8
		 /* if-eq v2, v0, :cond_7 */
		 int v3 = 2; // const/4 v3, 0x2
		 /* if-eq v2, v3, :cond_6 */
		 int v3 = 4; // const/4 v3, 0x4
		 /* if-eq v2, v3, :cond_5 */
		 /* const/16 v3, 0x8 */
		 /* if-eq v2, v3, :cond_4 */
		 /* const/16 v3, 0x10 */
		 /* if-eq v2, v3, :cond_3 */
		 /* const/16 v3, 0x20 */
		 /* if-eq v2, v3, :cond_2 */
		 /* const/16 v3, 0x40 */
		 /* if-eq v2, v3, :cond_1 */
		 /* const/16 v3, 0x80 */
		 /* if-eq v2, v3, :cond_0 */
		 /* .line 1 */
	 } // :cond_0
	 v3 = 	 android.view.WindowInsets$Type .displayCutout ( );
	 /* .line 2 */
} // :cond_1
v3 = android.view.WindowInsets$Type .tappableElement ( );
/* .line 3 */
} // :cond_2
v3 = android.view.WindowInsets$Type .mandatorySystemGestures ( );
/* .line 4 */
} // :cond_3
v3 = android.view.WindowInsets$Type .systemGestures ( );
/* .line 5 */
} // :cond_4
v3 = android.view.WindowInsets$Type .ime ( );
/* .line 6 */
} // :cond_5
v3 = android.view.WindowInsets$Type .captionBar ( );
/* .line 7 */
} // :cond_6
v3 = android.view.WindowInsets$Type .navigationBars ( );
/* .line 8 */
} // :cond_7
v3 = android.view.WindowInsets$Type .statusBars ( );
} // :goto_1
/* or-int/2addr v1, v3 */
} // :cond_8
} // :goto_2
/* shl-int/lit8 v2, v2, 0x1 */
} // :cond_9
} // .end method
