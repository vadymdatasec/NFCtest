.class public final Lc/l/d/a;
.super Lc/l/d/e2;
.source "SourceFile"

# interfaces
.implements Lc/l/d/l1;


# instance fields
.field public final q:Lc/l/d/o1;

.field public r:Z

.field public s:I


# direct methods
.method public constructor <init>(Lc/l/d/o1;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lc/l/d/o1;->x()Lc/l/d/q0;

    move-result-object v0

    invoke-virtual {p1}, Lc/l/d/o1;->A()Lc/l/d/r0;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {p1}, Lc/l/d/o1;->A()Lc/l/d/r0;

    move-result-object v1

    invoke-virtual {v1}, Lc/l/d/r0;->h()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 3
    :goto_0
    invoke-direct {p0, v0, v1}, Lc/l/d/e2;-><init>(Lc/l/d/q0;Ljava/lang/ClassLoader;)V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lc/l/d/a;->s:I

    .line 5
    iput-object p1, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    return-void
.end method

.method public static b(Lc/l/d/d2;)Z
    .locals 1

    .line 26
    iget-object p0, p0, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    if-eqz p0, :cond_0

    .line 27
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->m:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->B:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->A:Z

    if-nez v0, :cond_0

    .line 28
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->V()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public a()I
    .locals 1

    const/4 v0, 0x0

    .line 69
    invoke-virtual {p0, v0}, Lc/l/d/a;->b(Z)I

    move-result v0

    return v0
.end method

.method public a(Ljava/util/ArrayList;Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/Fragment;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/Fragment;",
            ">;",
            "Landroidx/fragment/app/Fragment;",
            ")",
            "Landroidx/fragment/app/Fragment;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    const/4 v4, 0x0

    .line 84
    :goto_0
    iget-object v5, v0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_a

    .line 85
    iget-object v5, v0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lc/l/d/d2;

    .line 86
    iget v6, v5, Lc/l/d/d2;->a:I

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v6, v8, :cond_8

    const/4 v9, 0x2

    const/4 v10, 0x3

    const/16 v11, 0x9

    if-eq v6, v9, :cond_2

    if-eq v6, v10, :cond_1

    const/4 v9, 0x6

    if-eq v6, v9, :cond_1

    const/4 v7, 0x7

    if-eq v6, v7, :cond_8

    const/16 v7, 0x8

    if-eq v6, v7, :cond_0

    goto/16 :goto_3

    .line 87
    :cond_0
    iget-object v6, v0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    new-instance v7, Lc/l/d/d2;

    invoke-direct {v7, v11, v3}, Lc/l/d/d2;-><init>(ILandroidx/fragment/app/Fragment;)V

    invoke-virtual {v6, v4, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    .line 88
    iget-object v3, v5, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    goto/16 :goto_3

    .line 89
    :cond_1
    iget-object v6, v5, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 90
    iget-object v5, v5, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    if-ne v5, v3, :cond_9

    .line 91
    iget-object v3, v0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    new-instance v6, Lc/l/d/d2;

    invoke-direct {v6, v11, v5}, Lc/l/d/d2;-><init>(ILandroidx/fragment/app/Fragment;)V

    invoke-virtual {v3, v4, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    move-object v3, v7

    goto :goto_3

    .line 92
    :cond_2
    iget-object v6, v5, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    .line 93
    iget v9, v6, Landroidx/fragment/app/Fragment;->y:I

    .line 94
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v12

    sub-int/2addr v12, v8

    const/4 v13, 0x0

    :goto_1
    if-ltz v12, :cond_6

    .line 95
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/fragment/app/Fragment;

    .line 96
    iget v15, v14, Landroidx/fragment/app/Fragment;->y:I

    if-ne v15, v9, :cond_5

    if-ne v14, v6, :cond_3

    const/4 v13, 0x1

    goto :goto_2

    :cond_3
    if-ne v14, v3, :cond_4

    .line 97
    iget-object v3, v0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    new-instance v15, Lc/l/d/d2;

    invoke-direct {v15, v11, v14}, Lc/l/d/d2;-><init>(ILandroidx/fragment/app/Fragment;)V

    invoke-virtual {v3, v4, v15}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    move-object v3, v7

    .line 98
    :cond_4
    new-instance v15, Lc/l/d/d2;

    invoke-direct {v15, v10, v14}, Lc/l/d/d2;-><init>(ILandroidx/fragment/app/Fragment;)V

    .line 99
    iget v2, v5, Lc/l/d/d2;->c:I

    iput v2, v15, Lc/l/d/d2;->c:I

    .line 100
    iget v2, v5, Lc/l/d/d2;->e:I

    iput v2, v15, Lc/l/d/d2;->e:I

    .line 101
    iget v2, v5, Lc/l/d/d2;->d:I

    iput v2, v15, Lc/l/d/d2;->d:I

    .line 102
    iget v2, v5, Lc/l/d/d2;->f:I

    iput v2, v15, Lc/l/d/d2;->f:I

    .line 103
    iget-object v2, v0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v4, v15}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 104
    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    add-int/2addr v4, v8

    :cond_5
    :goto_2
    add-int/lit8 v12, v12, -0x1

    goto :goto_1

    :cond_6
    if-eqz v13, :cond_7

    .line 105
    iget-object v2, v0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v4, v4, -0x1

    goto :goto_3

    .line 106
    :cond_7
    iput v8, v5, Lc/l/d/d2;->a:I

    .line 107
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 108
    :cond_8
    iget-object v2, v5, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9
    :goto_3
    add-int/2addr v4, v8

    goto/16 :goto_0

    :cond_a
    return-object v3
.end method

.method public a(Landroidx/fragment/app/Fragment;)Lc/l/d/e2;
    .locals 3

    .line 49
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->t:Lc/l/d/o1;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 50
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot remove Fragment attached to a different FragmentManager. Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is already attached to a FragmentManager."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 52
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Lc/l/d/e2;->a(Landroidx/fragment/app/Fragment;)Lc/l/d/e2;

    return-object p0
.end method

.method public a(Landroidx/fragment/app/Fragment;Lc/n/g$b;)Lc/l/d/e2;
    .locals 3

    .line 53
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->t:Lc/l/d/o1;

    iget-object v1, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    if-ne v0, v1, :cond_3

    .line 54
    sget-object v0, Lc/n/g$b;->c:Lc/n/g$b;

    const-string v1, "Cannot set maximum Lifecycle to "

    if-ne p2, v0, :cond_1

    iget v0, p1, Landroidx/fragment/app/Fragment;->b:I

    const/4 v2, -0x1

    if-gt v0, v2, :cond_0

    goto :goto_0

    .line 55
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " after the Fragment has been created"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 56
    :cond_1
    :goto_0
    sget-object v0, Lc/n/g$b;->b:Lc/n/g$b;

    if-eq p2, v0, :cond_2

    .line 57
    invoke-super {p0, p1, p2}, Lc/l/d/e2;->a(Landroidx/fragment/app/Fragment;Lc/n/g$b;)Lc/l/d/e2;

    return-object p0

    .line 58
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 59
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Cannot setMaxLifecycle for Fragment not attached to FragmentManager "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(I)V
    .locals 7

    .line 60
    iget-boolean v0, p0, Lc/l/d/e2;->g:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x2

    .line 61
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v1

    const-string v2, "FragmentManager"

    if-eqz v1, :cond_1

    .line 62
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Bump nesting in "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " by "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    :cond_1
    iget-object v1, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    .line 64
    iget-object v4, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc/l/d/d2;

    .line 65
    iget-object v5, v4, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    if-eqz v5, :cond_2

    .line 66
    iget v6, v5, Landroidx/fragment/app/Fragment;->s:I

    add-int/2addr v6, p1

    iput v6, v5, Landroidx/fragment/app/Fragment;->s:I

    .line 67
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 68
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Bump nesting of "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v4, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " to "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v4, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    iget v4, v4, Landroidx/fragment/app/Fragment;->s:I

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public a(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V
    .locals 0

    .line 47
    invoke-super {p0, p1, p2, p3, p4}, Lc/l/d/e2;->a(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 48
    iget-object p1, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    iput-object p1, p2, Landroidx/fragment/app/Fragment;->t:Lc/l/d/o1;

    return-void
.end method

.method public a(Lc/l/d/z;)V
    .locals 3

    const/4 v0, 0x0

    .line 109
    :goto_0
    iget-object v1, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 110
    iget-object v1, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/d2;

    .line 111
    invoke-static {v1}, Lc/l/d/a;->b(Lc/l/d/d2;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 112
    iget-object v1, v1, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    invoke-virtual {v1, p1}, Landroidx/fragment/app/Fragment;->a(Lc/l/d/z;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/io/PrintWriter;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lc/l/d/a;->a(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/io/PrintWriter;Z)V
    .locals 5

    if-eqz p3, :cond_8

    .line 2
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mName="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lc/l/d/e2;->h:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mIndex="

    .line 3
    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lc/l/d/a;->s:I

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, " mCommitted="

    .line 4
    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Lc/l/d/a;->r:Z

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 5
    iget v0, p0, Lc/l/d/e2;->f:I

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mTransition=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 7
    iget v0, p0, Lc/l/d/e2;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 8
    :cond_0
    iget v0, p0, Lc/l/d/e2;->b:I

    if-nez v0, :cond_1

    iget v0, p0, Lc/l/d/e2;->c:I

    if-eqz v0, :cond_2

    .line 9
    :cond_1
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mEnterAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 10
    iget v0, p0, Lc/l/d/e2;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mExitAnim=#"

    .line 11
    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 12
    iget v0, p0, Lc/l/d/e2;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 13
    :cond_2
    iget v0, p0, Lc/l/d/e2;->d:I

    if-nez v0, :cond_3

    iget v0, p0, Lc/l/d/e2;->e:I

    if-eqz v0, :cond_4

    .line 14
    :cond_3
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mPopEnterAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 15
    iget v0, p0, Lc/l/d/e2;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mPopExitAnim=#"

    .line 16
    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 17
    iget v0, p0, Lc/l/d/e2;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 18
    :cond_4
    iget v0, p0, Lc/l/d/e2;->i:I

    if-nez v0, :cond_5

    iget-object v0, p0, Lc/l/d/e2;->j:Ljava/lang/CharSequence;

    if-eqz v0, :cond_6

    .line 19
    :cond_5
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mBreadCrumbTitleRes=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 20
    iget v0, p0, Lc/l/d/e2;->i:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mBreadCrumbTitleText="

    .line 21
    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 22
    iget-object v0, p0, Lc/l/d/e2;->j:Ljava/lang/CharSequence;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 23
    :cond_6
    iget v0, p0, Lc/l/d/e2;->k:I

    if-nez v0, :cond_7

    iget-object v0, p0, Lc/l/d/e2;->l:Ljava/lang/CharSequence;

    if-eqz v0, :cond_8

    .line 24
    :cond_7
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mBreadCrumbShortTitleRes=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 25
    iget v0, p0, Lc/l/d/e2;->k:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mBreadCrumbShortTitleText="

    .line 26
    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 27
    iget-object v0, p0, Lc/l/d/e2;->l:Ljava/lang/CharSequence;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 28
    :cond_8
    iget-object v0, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    .line 29
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Operations:"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 30
    iget-object v0, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_d

    .line 31
    iget-object v2, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/l/d/d2;

    .line 32
    iget v3, v2, Lc/l/d/d2;->a:I

    packed-switch v3, :pswitch_data_0

    .line 33
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "cmd="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v2, Lc/l/d/d2;->a:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :pswitch_0
    const-string v3, "OP_SET_MAX_LIFECYCLE"

    goto :goto_1

    :pswitch_1
    const-string v3, "UNSET_PRIMARY_NAV"

    goto :goto_1

    :pswitch_2
    const-string v3, "SET_PRIMARY_NAV"

    goto :goto_1

    :pswitch_3
    const-string v3, "ATTACH"

    goto :goto_1

    :pswitch_4
    const-string v3, "DETACH"

    goto :goto_1

    :pswitch_5
    const-string v3, "SHOW"

    goto :goto_1

    :pswitch_6
    const-string v3, "HIDE"

    goto :goto_1

    :pswitch_7
    const-string v3, "REMOVE"

    goto :goto_1

    :pswitch_8
    const-string v3, "REPLACE"

    goto :goto_1

    :pswitch_9
    const-string v3, "ADD"

    goto :goto_1

    :pswitch_a
    const-string v3, "NULL"

    .line 34
    :goto_1
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v4, "  Op #"

    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(I)V

    const-string v4, ": "

    .line 35
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, " "

    .line 36
    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v3, v2, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    if-eqz p3, :cond_c

    .line 37
    iget v3, v2, Lc/l/d/d2;->c:I

    if-nez v3, :cond_9

    iget v3, v2, Lc/l/d/d2;->d:I

    if-eqz v3, :cond_a

    .line 38
    :cond_9
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "enterAnim=#"

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 39
    iget v3, v2, Lc/l/d/d2;->c:I

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, " exitAnim=#"

    .line 40
    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 41
    iget v3, v2, Lc/l/d/d2;->d:I

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 42
    :cond_a
    iget v3, v2, Lc/l/d/d2;->e:I

    if-nez v3, :cond_b

    iget v3, v2, Lc/l/d/d2;->f:I

    if-eqz v3, :cond_c

    .line 43
    :cond_b
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "popEnterAnim=#"

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 44
    iget v3, v2, Lc/l/d/d2;->e:I

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, " popExitAnim=#"

    .line 45
    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 46
    iget v2, v2, Lc/l/d/d2;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_c
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_d
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public a(Ljava/util/ArrayList;II)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lc/l/d/a;",
            ">;II)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-ne p3, p2, :cond_0

    return v0

    .line 76
    :cond_0
    iget-object v1, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_7

    .line 77
    iget-object v4, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc/l/d/d2;

    .line 78
    iget-object v4, v4, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    if-eqz v4, :cond_1

    iget v4, v4, Landroidx/fragment/app/Fragment;->y:I

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_6

    if-eq v4, v2, :cond_6

    move v2, p2

    :goto_2
    if-ge v2, p3, :cond_5

    .line 79
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lc/l/d/a;

    .line 80
    iget-object v6, v5, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_3
    if-ge v7, v6, :cond_4

    .line 81
    iget-object v8, v5, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lc/l/d/d2;

    .line 82
    iget-object v8, v8, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    if-eqz v8, :cond_2

    .line 83
    iget v8, v8, Landroidx/fragment/app/Fragment;->y:I

    goto :goto_4

    :cond_2
    const/4 v8, 0x0

    :goto_4
    if-ne v8, v4, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    move v2, v4

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_7
    return v0
.end method

.method public a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lc/l/d/a;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x2

    .line 70
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Run: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    :cond_0
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    .line 73
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    iget-boolean p1, p0, Lc/l/d/e2;->g:Z

    if-eqz p1, :cond_1

    .line 75
    iget-object p1, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {p1, p0}, Lc/l/d/o1;->a(Lc/l/d/a;)V

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public b()I
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lc/l/d/a;->b(Z)I

    move-result v0

    return v0
.end method

.method public b(Z)I
    .locals 2

    .line 2
    iget-boolean v0, p0, Lc/l/d/a;->r:Z

    if-nez v0, :cond_2

    const/4 v0, 0x2

    .line 3
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Commit: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    new-instance v0, Lc/l/d/z2;

    invoke-direct {v0, v1}, Lc/l/d/z2;-><init>(Ljava/lang/String;)V

    .line 6
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    const-string v0, "  "

    .line 7
    invoke-virtual {p0, v0, v1}, Lc/l/d/a;->a(Ljava/lang/String;Ljava/io/PrintWriter;)V

    .line 8
    invoke-virtual {v1}, Ljava/io/PrintWriter;->close()V

    :cond_0
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lc/l/d/a;->r:Z

    .line 10
    iget-boolean v0, p0, Lc/l/d/e2;->g:Z

    if-eqz v0, :cond_1

    .line 11
    iget-object v0, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->a()I

    move-result v0

    iput v0, p0, Lc/l/d/a;->s:I

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    .line 12
    iput v0, p0, Lc/l/d/a;->s:I

    .line 13
    :goto_0
    iget-object v0, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v0, p0, p1}, Lc/l/d/o1;->a(Lc/l/d/l1;Z)V

    .line 14
    iget p1, p0, Lc/l/d/a;->s:I

    return p1

    .line 15
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "commit already called"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Ljava/util/ArrayList;Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/Fragment;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/Fragment;",
            ">;",
            "Landroidx/fragment/app/Fragment;",
            ")",
            "Landroidx/fragment/app/Fragment;"
        }
    .end annotation

    .line 19
    iget-object v0, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_2

    .line 20
    iget-object v2, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/l/d/d2;

    .line 21
    iget v3, v2, Lc/l/d/d2;->a:I

    if-eq v3, v1, :cond_1

    const/4 v4, 0x3

    if-eq v3, v4, :cond_0

    packed-switch v3, :pswitch_data_0

    goto :goto_1

    .line 22
    :pswitch_0
    iget-object v3, v2, Lc/l/d/d2;->g:Lc/n/g$b;

    iput-object v3, v2, Lc/l/d/d2;->h:Lc/n/g$b;

    goto :goto_1

    .line 23
    :pswitch_1
    iget-object p2, v2, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    goto :goto_1

    :pswitch_2
    const/4 p2, 0x0

    goto :goto_1

    .line 24
    :cond_0
    :pswitch_3
    iget-object v2, v2, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 25
    :cond_1
    :pswitch_4
    iget-object v2, v2, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    return-object p2

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(I)Z
    .locals 4

    .line 16
    iget-object v0, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 17
    iget-object v3, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/l/d/d2;

    .line 18
    iget-object v3, v3, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    if-eqz v3, :cond_0

    iget v3, v3, Landroidx/fragment/app/Fragment;->y:I

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_1

    if-ne v3, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public c()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/l/d/e2;->d()Lc/l/d/e2;

    .line 2
    iget-object v0, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Lc/l/d/o1;->b(Lc/l/d/l1;Z)V

    return-void
.end method

.method public c(Z)V
    .locals 8

    .line 3
    iget-object v0, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_2

    .line 4
    iget-object v2, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/l/d/d2;

    .line 5
    iget-object v3, v2, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    if-eqz v3, :cond_0

    .line 6
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->j(Z)V

    .line 7
    iget v4, p0, Lc/l/d/e2;->f:I

    invoke-static {v4}, Lc/l/d/o1;->e(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroidx/fragment/app/Fragment;->a(I)V

    .line 8
    iget-object v4, p0, Lc/l/d/e2;->n:Ljava/util/ArrayList;

    iget-object v5, p0, Lc/l/d/e2;->m:Ljava/util/ArrayList;

    invoke-virtual {v3, v4, v5}, Landroidx/fragment/app/Fragment;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 9
    :cond_0
    iget v4, v2, Lc/l/d/d2;->a:I

    packed-switch v4, :pswitch_data_0

    .line 10
    :pswitch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown cmd: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, v2, Lc/l/d/d2;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 11
    :pswitch_1
    iget-object v4, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    iget-object v5, v2, Lc/l/d/d2;->g:Lc/n/g$b;

    invoke-virtual {v4, v3, v5}, Lc/l/d/o1;->a(Landroidx/fragment/app/Fragment;Lc/n/g$b;)V

    goto/16 :goto_1

    .line 12
    :pswitch_2
    iget-object v4, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v4, v3}, Lc/l/d/o1;->v(Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_1

    .line 13
    :pswitch_3
    iget-object v4, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lc/l/d/o1;->v(Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_1

    .line 14
    :pswitch_4
    iget v4, v2, Lc/l/d/d2;->c:I

    iget v5, v2, Lc/l/d/d2;->d:I

    iget v6, v2, Lc/l/d/d2;->e:I

    iget v7, v2, Lc/l/d/d2;->f:I

    invoke-virtual {v3, v4, v5, v6, v7}, Landroidx/fragment/app/Fragment;->a(IIII)V

    .line 15
    iget-object v4, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v4, v3, v1}, Lc/l/d/o1;->a(Landroidx/fragment/app/Fragment;Z)V

    .line 16
    iget-object v4, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v4, v3}, Lc/l/d/o1;->g(Landroidx/fragment/app/Fragment;)V

    goto :goto_1

    .line 17
    :pswitch_5
    iget v4, v2, Lc/l/d/d2;->c:I

    iget v5, v2, Lc/l/d/d2;->d:I

    iget v6, v2, Lc/l/d/d2;->e:I

    iget v7, v2, Lc/l/d/d2;->f:I

    invoke-virtual {v3, v4, v5, v6, v7}, Landroidx/fragment/app/Fragment;->a(IIII)V

    .line 18
    iget-object v4, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v4, v3}, Lc/l/d/o1;->b(Landroidx/fragment/app/Fragment;)V

    goto :goto_1

    .line 19
    :pswitch_6
    iget v4, v2, Lc/l/d/d2;->c:I

    iget v5, v2, Lc/l/d/d2;->d:I

    iget v6, v2, Lc/l/d/d2;->e:I

    iget v7, v2, Lc/l/d/d2;->f:I

    invoke-virtual {v3, v4, v5, v6, v7}, Landroidx/fragment/app/Fragment;->a(IIII)V

    .line 20
    iget-object v4, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v4, v3, v1}, Lc/l/d/o1;->a(Landroidx/fragment/app/Fragment;Z)V

    .line 21
    iget-object v4, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v4, v3}, Lc/l/d/o1;->m(Landroidx/fragment/app/Fragment;)V

    goto :goto_1

    .line 22
    :pswitch_7
    iget v4, v2, Lc/l/d/d2;->c:I

    iget v5, v2, Lc/l/d/d2;->d:I

    iget v6, v2, Lc/l/d/d2;->e:I

    iget v7, v2, Lc/l/d/d2;->f:I

    invoke-virtual {v3, v4, v5, v6, v7}, Landroidx/fragment/app/Fragment;->a(IIII)V

    .line 23
    iget-object v4, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v4, v3}, Lc/l/d/o1;->x(Landroidx/fragment/app/Fragment;)V

    goto :goto_1

    .line 24
    :pswitch_8
    iget v4, v2, Lc/l/d/d2;->c:I

    iget v5, v2, Lc/l/d/d2;->d:I

    iget v6, v2, Lc/l/d/d2;->e:I

    iget v7, v2, Lc/l/d/d2;->f:I

    invoke-virtual {v3, v4, v5, v6, v7}, Landroidx/fragment/app/Fragment;->a(IIII)V

    .line 25
    iget-object v4, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v4, v3}, Lc/l/d/o1;->a(Landroidx/fragment/app/Fragment;)Lc/l/d/a2;

    goto :goto_1

    .line 26
    :pswitch_9
    iget v4, v2, Lc/l/d/d2;->c:I

    iget v5, v2, Lc/l/d/d2;->d:I

    iget v6, v2, Lc/l/d/d2;->e:I

    iget v7, v2, Lc/l/d/d2;->f:I

    invoke-virtual {v3, v4, v5, v6, v7}, Landroidx/fragment/app/Fragment;->a(IIII)V

    .line 27
    iget-object v4, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v4, v3, v1}, Lc/l/d/o1;->a(Landroidx/fragment/app/Fragment;Z)V

    .line 28
    iget-object v4, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v4, v3}, Lc/l/d/o1;->t(Landroidx/fragment/app/Fragment;)V

    .line 29
    :goto_1
    iget-boolean v4, p0, Lc/l/d/e2;->o:Z

    if-nez v4, :cond_1

    iget v2, v2, Lc/l/d/d2;->a:I

    const/4 v4, 0x3

    if-eq v2, v4, :cond_1

    if-eqz v3, :cond_1

    .line 30
    sget-boolean v2, Lc/l/d/o1;->P:Z

    if-nez v2, :cond_1

    .line 31
    iget-object v2, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v2, v3}, Lc/l/d/o1;->r(Landroidx/fragment/app/Fragment;)V

    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto/16 :goto_0

    .line 32
    :cond_2
    iget-boolean v0, p0, Lc/l/d/e2;->o:Z

    if-nez v0, :cond_3

    if-eqz p1, :cond_3

    sget-boolean p1, Lc/l/d/o1;->P:Z

    if-nez p1, :cond_3

    .line 33
    iget-object p1, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    iget v0, p1, Lc/l/d/o1;->q:I

    invoke-virtual {p1, v0, v1}, Lc/l/d/o1;->a(IZ)V

    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public e()V
    .locals 10

    .line 1
    iget-object v0, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x1

    if-ge v2, v0, :cond_2

    .line 2
    iget-object v4, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc/l/d/d2;

    .line 3
    iget-object v5, v4, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    if-eqz v5, :cond_0

    .line 4
    invoke-virtual {v5, v1}, Landroidx/fragment/app/Fragment;->j(Z)V

    .line 5
    iget v6, p0, Lc/l/d/e2;->f:I

    invoke-virtual {v5, v6}, Landroidx/fragment/app/Fragment;->a(I)V

    .line 6
    iget-object v6, p0, Lc/l/d/e2;->m:Ljava/util/ArrayList;

    iget-object v7, p0, Lc/l/d/e2;->n:Ljava/util/ArrayList;

    invoke-virtual {v5, v6, v7}, Landroidx/fragment/app/Fragment;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 7
    :cond_0
    iget v6, v4, Lc/l/d/d2;->a:I

    packed-switch v6, :pswitch_data_0

    .line 8
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown cmd: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v4, Lc/l/d/d2;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9
    :pswitch_1
    iget-object v6, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    iget-object v7, v4, Lc/l/d/d2;->h:Lc/n/g$b;

    invoke-virtual {v6, v5, v7}, Lc/l/d/o1;->a(Landroidx/fragment/app/Fragment;Lc/n/g$b;)V

    goto/16 :goto_1

    .line 10
    :pswitch_2
    iget-object v6, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Lc/l/d/o1;->v(Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_1

    .line 11
    :pswitch_3
    iget-object v6, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v6, v5}, Lc/l/d/o1;->v(Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_1

    .line 12
    :pswitch_4
    iget v6, v4, Lc/l/d/d2;->c:I

    iget v7, v4, Lc/l/d/d2;->d:I

    iget v8, v4, Lc/l/d/d2;->e:I

    iget v9, v4, Lc/l/d/d2;->f:I

    invoke-virtual {v5, v6, v7, v8, v9}, Landroidx/fragment/app/Fragment;->a(IIII)V

    .line 13
    iget-object v6, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v6, v5, v1}, Lc/l/d/o1;->a(Landroidx/fragment/app/Fragment;Z)V

    .line 14
    iget-object v6, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v6, v5}, Lc/l/d/o1;->b(Landroidx/fragment/app/Fragment;)V

    goto :goto_1

    .line 15
    :pswitch_5
    iget v6, v4, Lc/l/d/d2;->c:I

    iget v7, v4, Lc/l/d/d2;->d:I

    iget v8, v4, Lc/l/d/d2;->e:I

    iget v9, v4, Lc/l/d/d2;->f:I

    invoke-virtual {v5, v6, v7, v8, v9}, Landroidx/fragment/app/Fragment;->a(IIII)V

    .line 16
    iget-object v6, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v6, v5}, Lc/l/d/o1;->g(Landroidx/fragment/app/Fragment;)V

    goto :goto_1

    .line 17
    :pswitch_6
    iget v6, v4, Lc/l/d/d2;->c:I

    iget v7, v4, Lc/l/d/d2;->d:I

    iget v8, v4, Lc/l/d/d2;->e:I

    iget v9, v4, Lc/l/d/d2;->f:I

    invoke-virtual {v5, v6, v7, v8, v9}, Landroidx/fragment/app/Fragment;->a(IIII)V

    .line 18
    iget-object v6, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v6, v5, v1}, Lc/l/d/o1;->a(Landroidx/fragment/app/Fragment;Z)V

    .line 19
    iget-object v6, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v6, v5}, Lc/l/d/o1;->x(Landroidx/fragment/app/Fragment;)V

    goto :goto_1

    .line 20
    :pswitch_7
    iget v6, v4, Lc/l/d/d2;->c:I

    iget v7, v4, Lc/l/d/d2;->d:I

    iget v8, v4, Lc/l/d/d2;->e:I

    iget v9, v4, Lc/l/d/d2;->f:I

    invoke-virtual {v5, v6, v7, v8, v9}, Landroidx/fragment/app/Fragment;->a(IIII)V

    .line 21
    iget-object v6, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v6, v5}, Lc/l/d/o1;->m(Landroidx/fragment/app/Fragment;)V

    goto :goto_1

    .line 22
    :pswitch_8
    iget v6, v4, Lc/l/d/d2;->c:I

    iget v7, v4, Lc/l/d/d2;->d:I

    iget v8, v4, Lc/l/d/d2;->e:I

    iget v9, v4, Lc/l/d/d2;->f:I

    invoke-virtual {v5, v6, v7, v8, v9}, Landroidx/fragment/app/Fragment;->a(IIII)V

    .line 23
    iget-object v6, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v6, v5}, Lc/l/d/o1;->t(Landroidx/fragment/app/Fragment;)V

    goto :goto_1

    .line 24
    :pswitch_9
    iget v6, v4, Lc/l/d/d2;->c:I

    iget v7, v4, Lc/l/d/d2;->d:I

    iget v8, v4, Lc/l/d/d2;->e:I

    iget v9, v4, Lc/l/d/d2;->f:I

    invoke-virtual {v5, v6, v7, v8, v9}, Landroidx/fragment/app/Fragment;->a(IIII)V

    .line 25
    iget-object v6, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v6, v5, v1}, Lc/l/d/o1;->a(Landroidx/fragment/app/Fragment;Z)V

    .line 26
    iget-object v6, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v6, v5}, Lc/l/d/o1;->a(Landroidx/fragment/app/Fragment;)Lc/l/d/a2;

    .line 27
    :goto_1
    iget-boolean v6, p0, Lc/l/d/e2;->o:Z

    if-nez v6, :cond_1

    iget v4, v4, Lc/l/d/d2;->a:I

    if-eq v4, v3, :cond_1

    if-eqz v5, :cond_1

    .line 28
    sget-boolean v3, Lc/l/d/o1;->P:Z

    if-nez v3, :cond_1

    .line 29
    iget-object v3, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v3, v5}, Lc/l/d/o1;->r(Landroidx/fragment/app/Fragment;)V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 30
    :cond_2
    iget-boolean v0, p0, Lc/l/d/e2;->o:Z

    if-nez v0, :cond_3

    sget-boolean v0, Lc/l/d/o1;->P:Z

    if-nez v0, :cond_3

    .line 31
    iget-object v0, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    iget v1, v0, Lc/l/d/o1;->q:I

    invoke-virtual {v0, v1, v3}, Lc/l/d/o1;->a(IZ)V

    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/e2;->h:Ljava/lang/String;

    return-object v0
.end method

.method public g()Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    iget-object v2, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 2
    iget-object v2, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/l/d/d2;

    .line 3
    invoke-static {v2}, Lc/l/d/a;->b(Lc/l/d/d2;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/l/d/e2;->p:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lc/l/d/e2;->p:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 3
    iget-object v1, p0, Lc/l/d/e2;->p:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lc/l/d/e2;->p:Ljava/util/ArrayList;

    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "BackStackEntry{"

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    iget v1, p0, Lc/l/d/a;->s:I

    if-ltz v1, :cond_0

    const-string v1, " #"

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    iget v1, p0, Lc/l/d/a;->s:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 7
    :cond_0
    iget-object v1, p0, Lc/l/d/e2;->h:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v1, " "

    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    iget-object v1, p0, Lc/l/d/e2;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v1, "}"

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method