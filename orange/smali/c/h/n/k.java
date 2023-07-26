public abstract class c.h.n.k {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static Boolean a;
	 public static java.lang.reflect.Method b;
	 public static Boolean c;
	 public static java.lang.reflect.Field d;
	 /* # direct methods */
	 public static c.h.n.k ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public static android.content.DialogInterface$OnKeyListener a ( android.app.Dialog p0 ) {
		 /* .locals 3 */
		 /* .line 26 */
		 /* sget-boolean v0, Lc/h/n/k;->c:Z */
		 /* if-nez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 27 */
		 try { // :try_start_0
			 /* const-class v1, Landroid/app/Dialog; */
			 final String v2 = "mOnKeyListener"; // const-string v2, "mOnKeyListener"
			 (( java.lang.Class ) v1 ).getDeclaredField ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
			 /* .line 28 */
			 (( java.lang.reflect.Field ) v1 ).setAccessible ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/NoSuchFieldException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 29 */
			 /* :catch_0 */
			 c.h.n.k.c = (v0!= 0);
			 /* .line 30 */
		 } // :cond_0
		 v0 = c.h.n.k.d;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 31 */
			 try { // :try_start_1
				 (( java.lang.reflect.Field ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
				 /* check-cast p0, Landroid/content/DialogInterface$OnKeyListener; */
				 /* :try_end_1 */
				 /* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_1 */
				 /* :catch_1 */
			 } // :cond_1
			 int p0 = 0; // const/4 p0, 0x0
		 } // .end method
		 public static Boolean a ( android.app.ActionBar p0, android.view.KeyEvent p1 ) {
			 /* .locals 6 */
			 /* .line 10 */
			 /* sget-boolean v0, Lc/h/n/k;->a:Z */
			 int v1 = 1; // const/4 v1, 0x1
			 int v2 = 0; // const/4 v2, 0x0
			 /* if-nez v0, :cond_0 */
			 /* .line 11 */
			 try { // :try_start_0
				 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
				 final String v3 = "onMenuKeyEvent"; // const-string v3, "onMenuKeyEvent"
				 /* new-array v4, v1, [Ljava/lang/Class; */
				 /* const-class v5, Landroid/view/KeyEvent; */
				 /* aput-object v5, v4, v2 */
				 (( java.lang.Class ) v0 ).getMethod ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
				 /* :try_end_0 */
				 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* .line 12 */
				 /* :catch_0 */
				 c.h.n.k.a = (v1!= 0);
				 /* .line 13 */
			 } // :cond_0
			 v0 = c.h.n.k.b;
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 try { // :try_start_1
					 /* new-array v1, v1, [Ljava/lang/Object; */
					 /* aput-object p1, v1, v2 */
					 /* .line 14 */
					 (( java.lang.reflect.Method ) v0 ).invoke ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
					 /* check-cast p0, Ljava/lang/Boolean; */
					 p0 = 					 (( java.lang.Boolean ) p0 ).booleanValue ( ); // invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z
					 /* :try_end_1 */
					 /* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_1 */
					 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 ..:try_end_1} :catch_1 */
					 /* :catch_1 */
				 } // :cond_1
			 } // .end method
			 public static Boolean a ( android.app.Activity p0, android.view.KeyEvent p1 ) {
				 /* .locals 5 */
				 /* .line 15 */
				 (( android.app.Activity ) p0 ).onUserInteraction ( ); // invoke-virtual {p0}, Landroid/app/Activity;->onUserInteraction()V
				 /* .line 16 */
				 (( android.app.Activity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
				 /* const/16 v1, 0x8 */
				 /* .line 17 */
				 v1 = 				 (( android.view.Window ) v0 ).hasFeature ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Window;->hasFeature(I)Z
				 int v2 = 1; // const/4 v2, 0x1
				 if ( v1 != null) { // if-eqz v1, :cond_0
					 /* .line 18 */
					 (( android.app.Activity ) p0 ).getActionBar ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getActionBar()Landroid/app/ActionBar;
					 /* .line 19 */
					 v3 = 					 (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
					 /* const/16 v4, 0x52 */
					 /* if-ne v3, v4, :cond_0 */
					 if ( v1 != null) { // if-eqz v1, :cond_0
						 /* .line 20 */
						 v1 = 						 c.h.n.k .a ( v1,p1 );
						 if ( v1 != null) { // if-eqz v1, :cond_0
							 /* .line 21 */
						 } // :cond_0
						 v1 = 						 (( android.view.Window ) v0 ).superDispatchKeyEvent ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/Window;->superDispatchKeyEvent(Landroid/view/KeyEvent;)Z
						 if ( v1 != null) { // if-eqz v1, :cond_1
							 /* .line 22 */
						 } // :cond_1
						 (( android.view.Window ) v0 ).getDecorView ( ); // invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
						 /* .line 23 */
						 v1 = 						 c.h.n.v0 .a ( v0,p1 );
						 if ( v1 != null) { // if-eqz v1, :cond_2
						 } // :cond_2
						 if ( v0 != null) { // if-eqz v0, :cond_3
							 /* .line 24 */
							 (( android.view.View ) v0 ).getKeyDispatcherState ( ); // invoke-virtual {v0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;
						 } // :cond_3
						 int v0 = 0; // const/4 v0, 0x0
						 /* .line 25 */
					 } // :goto_0
					 p0 = 					 (( android.view.KeyEvent ) p1 ).dispatch ( p0, v0, p0 ); // invoke-virtual {p1, p0, v0, p0}, Landroid/view/KeyEvent;->dispatch(Landroid/view/KeyEvent$Callback;Landroid/view/KeyEvent$DispatcherState;Ljava/lang/Object;)Z
				 } // .end method
				 public static Boolean a ( android.app.Dialog p0, android.view.KeyEvent p1 ) {
					 /* .locals 3 */
					 /* .line 32 */
					 c.h.n.k .a ( p0 );
					 int v1 = 1; // const/4 v1, 0x1
					 if ( v0 != null) { // if-eqz v0, :cond_0
						 /* .line 33 */
						 v0 = 						 v2 = 						 (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
						 if ( v0 != null) { // if-eqz v0, :cond_0
							 /* .line 34 */
						 } // :cond_0
						 (( android.app.Dialog ) p0 ).getWindow ( ); // invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;
						 /* .line 35 */
						 v2 = 						 (( android.view.Window ) v0 ).superDispatchKeyEvent ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/Window;->superDispatchKeyEvent(Landroid/view/KeyEvent;)Z
						 if ( v2 != null) { // if-eqz v2, :cond_1
							 /* .line 36 */
						 } // :cond_1
						 (( android.view.Window ) v0 ).getDecorView ( ); // invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
						 /* .line 37 */
						 v2 = 						 c.h.n.v0 .a ( v0,p1 );
						 if ( v2 != null) { // if-eqz v2, :cond_2
						 } // :cond_2
						 if ( v0 != null) { // if-eqz v0, :cond_3
							 /* .line 38 */
							 (( android.view.View ) v0 ).getKeyDispatcherState ( ); // invoke-virtual {v0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;
						 } // :cond_3
						 int v0 = 0; // const/4 v0, 0x0
						 /* .line 39 */
					 } // :goto_0
					 p0 = 					 (( android.view.KeyEvent ) p1 ).dispatch ( p0, v0, p0 ); // invoke-virtual {p1, p0, v0, p0}, Landroid/view/KeyEvent;->dispatch(Landroid/view/KeyEvent$Callback;Landroid/view/KeyEvent$DispatcherState;Ljava/lang/Object;)Z
				 } // .end method
				 public static Boolean a ( android.view.View p0, android.view.KeyEvent p1 ) {
					 /* .locals 0 */
					 /* .line 1 */
					 p0 = 					 c.h.n.v0 .b ( p0,p1 );
				 } // .end method
				 public static Boolean a ( Object p0, android.view.View p1, android.view.Window$Callback p2, android.view.KeyEvent p3 ) {
					 /* .locals 3 */
					 int v0 = 0; // const/4 v0, 0x0
					 /* if-nez p0, :cond_0 */
					 /* .line 2 */
				 } // :cond_0
				 /* const/16 v2, 0x1c */
				 /* if-lt v1, v2, :cond_1 */
				 p0 = 				 /* .line 3 */
				 /* .line 4 */
			 } // :cond_1
			 /* instance-of v1, p2, Landroid/app/Activity; */
			 if ( v1 != null) { // if-eqz v1, :cond_2
				 /* .line 5 */
				 /* check-cast p2, Landroid/app/Activity; */
				 p0 = 				 c.h.n.k .a ( p2,p3 );
				 /* .line 6 */
			 } // :cond_2
			 /* instance-of v1, p2, Landroid/app/Dialog; */
			 if ( v1 != null) { // if-eqz v1, :cond_3
				 /* .line 7 */
				 /* check-cast p2, Landroid/app/Dialog; */
				 p0 = 				 c.h.n.k .a ( p2,p3 );
			 } // :cond_3
			 if ( p1 != null) { // if-eqz p1, :cond_4
				 /* .line 8 */
				 p1 = 				 c.h.n.v0 .a ( p1,p3 );
				 /* if-nez p1, :cond_5 */
				 /* .line 9 */
			 p0 = 			 } // :cond_4
			 if ( p0 != null) { // if-eqz p0, :cond_6
			 } // :cond_5
			 int v0 = 1; // const/4 v0, 0x1
		 } // :cond_6
	 } // .end method
