.class public Lm/a/b/j/b/k0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;

.field public final synthetic c:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;


# direct methods
.method public constructor <init>(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm/a/b/j/b/k0/a;->c:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;

    iput-object p2, p0, Lm/a/b/j/b/k0/a;->b:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm/a/b/j/b/k0/a;->c:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;

    iget-object v1, p0, Lm/a/b/j/b/k0/a;->b:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;

    invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->nodeChanged(Ljavax/swing/tree/TreeNode;)V

    return-void
.end method
