.class public Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerLogRecordFilter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/log4j/lf5/LogRecordFilter;


# instance fields
.field public a:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;


# direct methods
.method public constructor <init>(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerLogRecordFilter;->a:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerLogRecordFilter;->a:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;

    invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->getRootCategoryNode()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;

    move-result-object v0

    invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->depthFirstEnumeration()Ljava/util/Enumeration;

    move-result-object v0

    .line 2
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;

    .line 4
    invoke-virtual {v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->resetNumberOfContainedRecords()V

    .line 5
    iget-object v2, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerLogRecordFilter;->a:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;

    invoke-virtual {v2, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->nodeChanged(Ljavax/swing/tree/TreeNode;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public passes(Lorg/apache/log4j/lf5/LogRecord;)Z
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;

    invoke-virtual {p1}, Lorg/apache/log4j/lf5/LogRecord;->getCategory()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;-><init>(Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerLogRecordFilter;->a:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;

    invoke-virtual {p1, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->isCategoryPathActive(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;)Z

    move-result p1

    return p1
.end method

.method public reset()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerLogRecordFilter;->a()V

    return-void
.end method
