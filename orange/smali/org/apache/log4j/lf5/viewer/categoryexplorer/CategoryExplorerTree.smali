.class public Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;
.super Ljavax/swing/JTree;
.source "SourceFile"


# instance fields
.field public a:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljavax/swing/JTree;-><init>()V

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->b:Z

    .line 7
    new-instance v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;

    const-string v1, "Categories"

    invoke-direct {v0, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;-><init>(Ljava/lang/String;)V

    .line 8
    new-instance v1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;

    invoke-direct {v1, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;-><init>(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;)V

    iput-object v1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->a:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;

    .line 9
    invoke-virtual {p0, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->setModel(Ljavax/swing/tree/TreeModel;)V

    .line 10
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->c()V

    return-void
.end method

.method public constructor <init>(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Ljavax/swing/JTree;-><init>(Ljavax/swing/tree/TreeModel;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->b:Z

    .line 3
    iput-object p1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->a:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;

    .line 4
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->c()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->a:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;

    new-instance v1, Lm/a/b/j/b/k0/b;

    invoke-direct {v1, p0}, Lm/a/b/j/b/k0/b;-><init>(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;)V

    invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->addTreeModelListener(Ljavax/swing/event/TreeModelListener;)V

    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->b:Z

    .line 3
    new-instance v0, Ljavax/swing/tree/TreePath;

    iget-object v1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->a:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;

    invoke-virtual {v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->getRootCategoryNode()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;

    move-result-object v1

    invoke-virtual {v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getPath()[Ljavax/swing/tree/TreeNode;

    move-result-object v1

    invoke-direct {v0, v1}, Ljavax/swing/tree/TreePath;-><init>([Ljava/lang/Object;)V

    .line 4
    invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->expandPath(Ljavax/swing/tree/TreePath;)V

    return-void
.end method

.method public c()V
    .locals 4

    const-string v0, "JTree.lineStyle"

    const-string v1, "Angled"

    .line 1
    invoke-virtual {p0, v0, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->putClientProperty(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2
    new-instance v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;

    invoke-direct {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;-><init>()V

    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->setEditable(Z)V

    .line 4
    invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->setCellRenderer(Ljavax/swing/tree/TreeCellRenderer;)V

    .line 5
    new-instance v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditor;

    iget-object v2, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->a:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;

    invoke-direct {v0, v2}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditor;-><init>(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;)V

    .line 6
    new-instance v2, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryImmediateEditor;

    new-instance v3, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;

    invoke-direct {v3}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;-><init>()V

    invoke-direct {v2, p0, v3, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryImmediateEditor;-><init>(Ljavax/swing/JTree;Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditor;)V

    invoke-virtual {p0, v2}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->setCellEditor(Ljavax/swing/tree/TreeCellEditor;)V

    .line 7
    invoke-virtual {p0, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->setShowsRootHandles(Z)V

    const-string v0, ""

    .line 8
    invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->setToolTipText(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->a()V

    return-void
.end method

.method public getExplorerModel()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->a:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;

    return-object v0
.end method

.method public getToolTipText(Ljava/awt/event/MouseEvent;)Ljava/lang/String;
    .locals 0

    .line 1
    :try_start_0
    invoke-super {p0, p1}, Ljavax/swing/JTree;->getToolTipText(Ljava/awt/event/MouseEvent;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const-string p1, ""

    return-object p1
.end method
