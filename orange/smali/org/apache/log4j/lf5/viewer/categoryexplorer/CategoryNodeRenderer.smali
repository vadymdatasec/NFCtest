.class public Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;
.super Ljavax/swing/tree/DefaultTreeCellRenderer;
.source "SourceFile"


# static fields
.field public static final FATAL_CHILDREN:Ljava/awt/Color;

.field public static c:Ljavax/swing/ImageIcon;


# instance fields
.field public a:Ljavax/swing/JCheckBox;

.field public b:Ljavax/swing/JPanel;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/awt/Color;

    const/16 v1, 0xbd

    const/16 v2, 0x71

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Ljava/awt/Color;-><init>(III)V

    sput-object v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->FATAL_CHILDREN:Ljava/awt/Color;

    const/4 v0, 0x0

    .line 2
    sput-object v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->c:Ljavax/swing/ImageIcon;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljavax/swing/tree/DefaultTreeCellRenderer;-><init>()V

    .line 2
    new-instance v0, Ljavax/swing/JCheckBox;

    invoke-direct {v0}, Ljavax/swing/JCheckBox;-><init>()V

    iput-object v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->a:Ljavax/swing/JCheckBox;

    .line 3
    new-instance v0, Ljavax/swing/JPanel;

    invoke-direct {v0}, Ljavax/swing/JPanel;-><init>()V

    iput-object v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->b:Ljavax/swing/JPanel;

    const-string v1, "Tree.textBackground"

    .line 4
    invoke-static {v1}, Ljavax/swing/UIManager;->getColor(Ljava/lang/Object;)Ljava/awt/Color;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JPanel;->setBackground(Ljava/awt/Color;)V

    .line 5
    sget-object v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->c:Ljavax/swing/ImageIcon;

    if-nez v0, :cond_0

    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "/org/apache/log4j/lf5/viewer/images/channelexplorer_satellite.gif"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getResource(Ljava/lang/String;)Ljava/net/URL;

    move-result-object v0

    .line 7
    new-instance v1, Ljavax/swing/ImageIcon;

    invoke-direct {v1, v0}, Ljavax/swing/ImageIcon;-><init>(Ljava/net/URL;)V

    sput-object v1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->c:Ljavax/swing/ImageIcon;

    :cond_0
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->setOpaque(Z)V

    .line 9
    iget-object v1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->a:Ljavax/swing/JCheckBox;

    invoke-virtual {v1, v0}, Ljavax/swing/JCheckBox;->setOpaque(Z)V

    .line 10
    iget-object v1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->b:Ljavax/swing/JPanel;

    invoke-virtual {v1, v0}, Ljavax/swing/JPanel;->setOpaque(Z)V

    .line 11
    iget-object v1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->b:Ljavax/swing/JPanel;

    new-instance v2, Ljava/awt/FlowLayout;

    invoke-direct {v2, v0, v0, v0}, Ljava/awt/FlowLayout;-><init>(III)V

    invoke-virtual {v1, v2}, Ljavax/swing/JPanel;->setLayout(Ljava/awt/LayoutManager;)V

    .line 12
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->b:Ljavax/swing/JPanel;

    iget-object v1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->a:Ljavax/swing/JCheckBox;

    invoke-virtual {v0, v1}, Ljavax/swing/JPanel;->add(Ljava/awt/Component;)Ljava/awt/Component;

    .line 13
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->b:Ljavax/swing/JPanel;

    invoke-virtual {v0, p0}, Ljavax/swing/JPanel;->add(Ljava/awt/Component;)Ljava/awt/Component;

    .line 14
    sget-object v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->c:Ljavax/swing/ImageIcon;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->setOpenIcon(Ljavax/swing/Icon;)V

    .line 15
    sget-object v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->c:Ljavax/swing/ImageIcon;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->setClosedIcon(Ljavax/swing/Icon;)V

    .line 16
    sget-object v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->c:Ljavax/swing/ImageIcon;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->setLeafIcon(Ljavax/swing/Icon;)V

    return-void
.end method


# virtual methods
.method public a(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 2
    invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, " contains a total of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 3
    invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->d()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string p1, " LogRecords."

    .line 4
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, " Right-click for more info."

    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 6
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getCheckBoxOffset()Ljava/awt/Dimension;
    .locals 2

    .line 1
    new-instance v0, Ljava/awt/Dimension;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Ljava/awt/Dimension;-><init>(II)V

    return-object v0
.end method

.method public getTreeCellRendererComponent(Ljavax/swing/JTree;Ljava/lang/Object;ZZZIZ)Ljava/awt/Component;
    .locals 1

    .line 1
    move-object v0, p2

    check-cast v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;

    .line 2
    invoke-super/range {p0 .. p7}, Ljavax/swing/tree/DefaultTreeCellRenderer;->getTreeCellRendererComponent(Ljavax/swing/JTree;Ljava/lang/Object;ZZZIZ)Ljava/awt/Component;

    if-nez p6, :cond_0

    .line 3
    iget-object p1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->a:Ljavax/swing/JCheckBox;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljavax/swing/JCheckBox;->setVisible(Z)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->a:Ljavax/swing/JCheckBox;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljavax/swing/JCheckBox;->setVisible(Z)V

    .line 5
    iget-object p1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->a:Ljavax/swing/JCheckBox;

    invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->isSelected()Z

    move-result p2

    invoke-virtual {p1, p2}, Ljavax/swing/JCheckBox;->setSelected(Z)V

    .line 6
    :goto_0
    invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->a(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;)Ljava/lang/String;

    move-result-object p1

    .line 7
    iget-object p2, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->b:Ljavax/swing/JPanel;

    invoke-virtual {p2, p1}, Ljavax/swing/JPanel;->setToolTipText(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->hasFatalChildren()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 9
    sget-object p1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->FATAL_CHILDREN:Ljava/awt/Color;

    invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->setForeground(Ljava/awt/Color;)V

    .line 10
    :cond_1
    invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->hasFatalRecords()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 11
    sget-object p1, Ljava/awt/Color;->red:Ljava/awt/Color;

    invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->setForeground(Ljava/awt/Color;)V

    .line 12
    :cond_2
    iget-object p1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->b:Ljavax/swing/JPanel;

    return-object p1
.end method
