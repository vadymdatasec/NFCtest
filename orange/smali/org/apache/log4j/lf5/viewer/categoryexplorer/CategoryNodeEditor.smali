.class public Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditor;
.super Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;
.source "SourceFile"


# instance fields
.field public f:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditorRenderer;

.field public g:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;

.field public h:Ljavax/swing/JCheckBox;


# direct methods
.method public constructor <init>(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;-><init>()V

    .line 2
    new-instance p1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditorRenderer;

    invoke-direct {p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditorRenderer;-><init>()V

    iput-object p1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditor;->f:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditorRenderer;

    .line 3
    invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditorRenderer;->getCheckBox()Ljavax/swing/JCheckBox;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditor;->h:Ljavax/swing/JCheckBox;

    .line 4
    new-instance v0, Lm/a/b/j/b/k0/c;

    invoke-direct {v0, p0}, Lm/a/b/j/b/k0/c;-><init>(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditor;)V

    invoke-virtual {p1, v0}, Ljavax/swing/JCheckBox;->addActionListener(Ljava/awt/event/ActionListener;)V

    .line 5
    iget-object p1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditor;->f:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditorRenderer;

    new-instance v0, Lm/a/b/j/b/k0/d;

    invoke-direct {v0, p0}, Lm/a/b/j/b/k0/d;-><init>(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditor;)V

    invoke-virtual {p1, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditorRenderer;->addMouseListener(Ljava/awt/event/MouseListener;)V

    return-void
.end method


# virtual methods
.method public getCellEditorValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditor;->g:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;

    invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getUserObject()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getTreeCellEditorComponent(Ljavax/swing/JTree;Ljava/lang/Object;ZZZI)Ljava/awt/Component;
    .locals 9

    .line 1
    move-object v0, p2

    check-cast v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;

    iput-object v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditor;->g:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;

    .line 2
    iget-object v1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditor;->f:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditorRenderer;

    const/4 v8, 0x1

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-virtual/range {v1 .. v8}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditorRenderer;->getTreeCellRendererComponent(Ljavax/swing/JTree;Ljava/lang/Object;ZZZIZ)Ljava/awt/Component;

    move-result-object p1

    return-object p1
.end method
