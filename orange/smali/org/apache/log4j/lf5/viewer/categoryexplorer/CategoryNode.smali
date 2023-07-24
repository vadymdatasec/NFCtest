.class public Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;
.super Ljavax/swing/tree/DefaultMutableTreeNode;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:I

.field public c:I

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljavax/swing/tree/DefaultMutableTreeNode;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->a:Z

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->b:I

    .line 4
    iput v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->c:I

    .line 5
    iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->d:Z

    .line 6
    iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->e:Z

    .line 7
    invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->setUserObject(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->c:I

    .line 2
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->b()V

    return-void
.end method

.method public addRecord()V
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->b:I

    .line 2
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->b()V

    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getParent()Ljavax/swing/tree/TreeNode;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    check-cast v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;

    invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->a()V

    return-void
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->c:I

    return v0
.end method

.method public d()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->c()I

    move-result v0

    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getNumberOfContainedRecords()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;

    .line 3
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getTitle()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public getNumberOfContainedRecords()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->b:I

    return v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getUserObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public hasFatalChildren()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->d:Z

    return v0
.end method

.method public hasFatalRecords()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->e:Z

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public isSelected()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->a:Z

    return v0
.end method

.method public resetNumberOfContainedRecords()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->b:I

    .line 2
    iput v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->c:I

    .line 3
    iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->e:Z

    .line 4
    iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->d:Z

    return-void
.end method

.method public setAllDescendantsDeSelected()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->children()Ljava/util/Enumeration;

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

    const/4 v2, 0x0

    .line 4
    invoke-virtual {v1, v2}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->setSelected(Z)V

    .line 5
    invoke-virtual {v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->setAllDescendantsDeSelected()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setAllDescendantsSelected()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->children()Ljava/util/Enumeration;

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

    const/4 v2, 0x1

    .line 4
    invoke-virtual {v1, v2}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->setSelected(Z)V

    .line 5
    invoke-virtual {v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->setAllDescendantsSelected()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setHasFatalChildren(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->d:Z

    return-void
.end method

.method public setHasFatalRecords(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->e:Z

    return-void
.end method

.method public setSelected(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->a:Z

    if-eq p1, v0, :cond_0

    .line 2
    iput-boolean p1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->a:Z

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getTitle()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
