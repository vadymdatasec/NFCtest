public abstract class org.apache.log4j.lf5.viewer.LogFactor5Dialog extends javax.swing.JDialog {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.awt.Font a;
	 /* # direct methods */
	 public static org.apache.log4j.lf5.viewer.LogFactor5Dialog ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/awt/Font; */
		 final String v1 = "Arial"; // const-string v1, "Arial"
		 int v2 = 1; // const/4 v2, 0x1
		 /* const/16 v3, 0xc */
		 /* invoke-direct {v0, v1, v2, v3}, Ljava/awt/Font;-><init>(Ljava/lang/String;II)V */
		 return;
	 } // .end method
	 public org.apache.log4j.lf5.viewer.LogFactor5Dialog ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, p3}, Ljavax/swing/JDialog;-><init>(Ljava/awt/Frame;Ljava/lang/String;Z)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.awt.GridBagConstraints a ( ) {
		 /* .locals 3 */
		 /* .line 21 */
		 /* new-instance v0, Ljava/awt/GridBagConstraints; */
		 /* invoke-direct {v0}, Ljava/awt/GridBagConstraints;-><init>()V */
		 /* const-wide/high16 v1, 0x3ff0000000000000L # 1.0 */
		 /* .line 22 */
		 /* iput-wide v1, v0, Ljava/awt/GridBagConstraints;->weightx:D */
		 /* .line 23 */
		 /* iput-wide v1, v0, Ljava/awt/GridBagConstraints;->weighty:D */
		 int v1 = 1; // const/4 v1, 0x1
		 /* .line 24 */
		 /* iput v1, v0, Ljava/awt/GridBagConstraints;->gridheight:I */
		 /* .line 25 */
		 /* new-instance v1, Ljava/awt/Insets; */
		 int v2 = 4; // const/4 v2, 0x4
		 /* invoke-direct {v1, v2, v2, v2, v2}, Ljava/awt/Insets;-><init>(IIII)V */
		 this.insets = v1;
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 26 */
		 /* iput v1, v0, Ljava/awt/GridBagConstraints;->fill:I */
		 /* const/16 v1, 0x11 */
		 /* .line 27 */
		 /* iput v1, v0, Ljava/awt/GridBagConstraints;->anchor:I */
	 } // .end method
	 public void a ( java.awt.Component p0, Integer p1, Integer p2 ) {
		 /* .locals 1 */
		 /* .line 28 */
		 (( java.awt.Component ) p1 ).getSize ( ); // invoke-virtual {p1}, Ljava/awt/Component;->getSize()Ljava/awt/Dimension;
		 /* iget v0, v0, Ljava/awt/Dimension;->width:I */
		 /* if-ge v0, p2, :cond_0 */
		 /* .line 29 */
		 (( java.awt.Component ) p1 ).getSize ( ); // invoke-virtual {p1}, Ljava/awt/Component;->getSize()Ljava/awt/Dimension;
		 /* iget v0, v0, Ljava/awt/Dimension;->height:I */
		 (( java.awt.Component ) p1 ).setSize ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Ljava/awt/Component;->setSize(II)V
		 /* .line 30 */
	 } // :cond_0
	 (( java.awt.Component ) p1 ).getSize ( ); // invoke-virtual {p1}, Ljava/awt/Component;->getSize()Ljava/awt/Dimension;
	 /* iget p2, p2, Ljava/awt/Dimension;->height:I */
	 /* if-ge p2, p3, :cond_1 */
	 /* .line 31 */
	 (( java.awt.Component ) p1 ).getSize ( ); // invoke-virtual {p1}, Ljava/awt/Component;->getSize()Ljava/awt/Dimension;
	 /* iget p2, p2, Ljava/awt/Dimension;->width:I */
	 (( java.awt.Component ) p1 ).setSize ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Ljava/awt/Component;->setSize(II)V
} // :cond_1
return;
} // .end method
public void a ( java.awt.Window p0 ) {
/* .locals 3 */
/* .line 1 */
java.awt.Toolkit .getDefaultToolkit ( );
(( java.awt.Toolkit ) v0 ).getScreenSize ( ); // invoke-virtual {v0}, Ljava/awt/Toolkit;->getScreenSize()Ljava/awt/Dimension;
/* .line 2 */
/* iget v1, v0, Ljava/awt/Dimension;->width:I */
(( java.awt.Window ) p1 ).getSize ( ); // invoke-virtual {p1}, Ljava/awt/Window;->getSize()Ljava/awt/Dimension;
/* iget v2, v2, Ljava/awt/Dimension;->width:I */
/* if-ge v1, v2, :cond_0 */
/* .line 3 */
/* iget v1, v0, Ljava/awt/Dimension;->width:I */
(( java.awt.Window ) p1 ).getSize ( ); // invoke-virtual {p1}, Ljava/awt/Window;->getSize()Ljava/awt/Dimension;
/* iget v2, v2, Ljava/awt/Dimension;->height:I */
(( java.awt.Window ) p1 ).setSize ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Ljava/awt/Window;->setSize(II)V
/* .line 4 */
} // :cond_0
/* iget v1, v0, Ljava/awt/Dimension;->height:I */
(( java.awt.Window ) p1 ).getSize ( ); // invoke-virtual {p1}, Ljava/awt/Window;->getSize()Ljava/awt/Dimension;
/* iget v2, v2, Ljava/awt/Dimension;->height:I */
/* if-ge v1, v2, :cond_1 */
/* .line 5 */
(( java.awt.Window ) p1 ).getSize ( ); // invoke-virtual {p1}, Ljava/awt/Window;->getSize()Ljava/awt/Dimension;
/* iget v1, v1, Ljava/awt/Dimension;->width:I */
/* iget v2, v0, Ljava/awt/Dimension;->height:I */
(( java.awt.Window ) p1 ).setSize ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Ljava/awt/Window;->setSize(II)V
/* .line 6 */
} // :cond_1
/* iget v1, v0, Ljava/awt/Dimension;->width:I */
(( java.awt.Window ) p1 ).getSize ( ); // invoke-virtual {p1}, Ljava/awt/Window;->getSize()Ljava/awt/Dimension;
/* iget v2, v2, Ljava/awt/Dimension;->width:I */
/* sub-int/2addr v1, v2 */
/* div-int/lit8 v1, v1, 0x2 */
/* .line 7 */
/* iget v0, v0, Ljava/awt/Dimension;->height:I */
(( java.awt.Window ) p1 ).getSize ( ); // invoke-virtual {p1}, Ljava/awt/Window;->getSize()Ljava/awt/Dimension;
/* iget v2, v2, Ljava/awt/Dimension;->height:I */
/* sub-int/2addr v0, v2 */
/* div-int/lit8 v0, v0, 0x2 */
/* .line 8 */
(( java.awt.Window ) p1 ).setLocation ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Ljava/awt/Window;->setLocation(II)V
return;
} // .end method
public void a ( java.lang.String p0, java.awt.Container p1 ) {
/* .locals 5 */
/* .line 9 */
(( org.apache.log4j.lf5.viewer.LogFactor5Dialog ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogFactor5Dialog;->a()Ljava/awt/GridBagConstraints;
int v1 = 0; // const/4 v1, 0x0
/* .line 10 */
/* iput v1, v0, Ljava/awt/GridBagConstraints;->gridwidth:I */
/* .line 11 */
/* new-instance v2, Ljava/awt/Insets; */
/* invoke-direct {v2, v1, v1, v1, v1}, Ljava/awt/Insets;-><init>(IIII)V */
this.insets = v2;
/* .line 12 */
(( java.awt.Container ) p2 ).getLayout ( ); // invoke-virtual {p2}, Ljava/awt/Container;->getLayout()Ljava/awt/LayoutManager;
/* check-cast v2, Ljava/awt/GridBagLayout; */
/* .line 13 */
} // :goto_0
v3 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-lez v3, :cond_1 */
/* const/16 v3, 0xa */
/* .line 14 */
v3 = (( java.lang.String ) p1 ).indexOf ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I
/* if-ltz v3, :cond_0 */
/* .line 15 */
(( java.lang.String ) p1 ).substring ( v1, v3 ); // invoke-virtual {p1, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* add-int/lit8 v3, v3, 0x1 */
/* .line 16 */
(( java.lang.String ) p1 ).substring ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* move-object v3, p1 */
/* move-object p1, v4 */
} // :cond_0
final String v3 = ""; // const-string v3, ""
/* .line 17 */
} // :goto_1
/* new-instance v4, Ljava/awt/Label; */
/* invoke-direct {v4, p1}, Ljava/awt/Label;-><init>(Ljava/lang/String;)V */
/* .line 18 */
p1 = org.apache.log4j.lf5.viewer.LogFactor5Dialog.a;
(( java.awt.Label ) v4 ).setFont ( p1 ); // invoke-virtual {v4, p1}, Ljava/awt/Label;->setFont(Ljava/awt/Font;)V
/* .line 19 */
(( java.awt.GridBagLayout ) v2 ).setConstraints ( v4, v0 ); // invoke-virtual {v2, v4, v0}, Ljava/awt/GridBagLayout;->setConstraints(Ljava/awt/Component;Ljava/awt/GridBagConstraints;)V
/* .line 20 */
(( java.awt.Container ) p2 ).add ( v4 ); // invoke-virtual {p2, v4}, Ljava/awt/Container;->add(Ljava/awt/Component;)Ljava/awt/Component;
/* move-object p1, v3 */
} // :cond_1
return;
} // .end method
public void show ( ) {
/* .locals 2 */
/* .line 1 */
(( org.apache.log4j.lf5.viewer.LogFactor5Dialog ) p0 ).pack ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogFactor5Dialog;->pack()V
/* const/16 v0, 0xc8 */
/* const/16 v1, 0x64 */
/* .line 2 */
(( org.apache.log4j.lf5.viewer.LogFactor5Dialog ) p0 ).a ( p0, v0, v1 ); // invoke-virtual {p0, p0, v0, v1}, Lorg/apache/log4j/lf5/viewer/LogFactor5Dialog;->a(Ljava/awt/Component;II)V
/* .line 3 */
(( org.apache.log4j.lf5.viewer.LogFactor5Dialog ) p0 ).a ( p0 ); // invoke-virtual {p0, p0}, Lorg/apache/log4j/lf5/viewer/LogFactor5Dialog;->a(Ljava/awt/Window;)V
/* .line 4 */
/* invoke-super {p0}, Ljavax/swing/JDialog;->show()V */
return;
} // .end method
