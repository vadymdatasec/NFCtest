.class public final Le/b/a/c0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/c0/d;
.implements Le/b/a/c0/o/g;
.implements Le/b/a/c0/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/c0/d;",
        "Le/b/a/c0/o/g;",
        "Le/b/a/c0/k;"
    }
.end annotation


# static fields
.field public static final E:Z


# instance fields
.field public A:I

.field public B:I

.field public C:Z

.field public D:Ljava/lang/RuntimeException;

.field public a:I

.field public final b:Ljava/lang/String;

.field public final c:Le/b/a/e0/u/l;

.field public final d:Ljava/lang/Object;

.field public final e:Le/b/a/c0/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/c0/i<",
            "TR;>;"
        }
    .end annotation
.end field

.field public final f:Le/b/a/c0/f;

.field public final g:Landroid/content/Context;

.field public final h:Le/b/a/j;

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TR;>;"
        }
    .end annotation
.end field

.field public final k:Le/b/a/c0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/c0/a<",
            "*>;"
        }
    .end annotation
.end field

.field public final l:I

.field public final m:I

.field public final n:Le/b/a/n;

.field public final o:Le/b/a/c0/o/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/c0/o/h<",
            "TR;>;"
        }
    .end annotation
.end field

.field public final p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/b/a/c0/i<",
            "TR;>;>;"
        }
    .end annotation
.end field

.field public final q:Le/b/a/c0/p/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/c0/p/e<",
            "-TR;>;"
        }
    .end annotation
.end field

.field public final r:Ljava/util/concurrent/Executor;

.field public s:Le/b/a/y/x/y0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/x/y0<",
            "TR;>;"
        }
    .end annotation
.end field

.field public t:Le/b/a/y/x/i0;

.field public u:J

.field public volatile v:Le/b/a/y/x/j0;

.field public w:Le/b/a/c0/l;

.field public x:Landroid/graphics/drawable/Drawable;

.field public y:Landroid/graphics/drawable/Drawable;

.field public z:Landroid/graphics/drawable/Drawable;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "GlideRequest"

    const/4 v1, 0x2

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Le/b/a/c0/m;->E:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Le/b/a/j;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Le/b/a/c0/a;IILe/b/a/n;Le/b/a/c0/o/h;Le/b/a/c0/i;Ljava/util/List;Le/b/a/c0/f;Le/b/a/y/x/j0;Le/b/a/c0/p/e;Ljava/util/concurrent/Executor;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Le/b/a/j;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "TR;>;",
            "Le/b/a/c0/a<",
            "*>;II",
            "Le/b/a/n;",
            "Le/b/a/c0/o/h<",
            "TR;>;",
            "Le/b/a/c0/i<",
            "TR;>;",
            "Ljava/util/List<",
            "Le/b/a/c0/i<",
            "TR;>;>;",
            "Le/b/a/c0/f;",
            "Le/b/a/y/x/j0;",
            "Le/b/a/c0/p/e<",
            "-TR;>;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-boolean v1, Le/b/a/c0/m;->E:Z

    if-eqz v1, :cond_0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-object v1, v0, Le/b/a/c0/m;->b:Ljava/lang/String;

    .line 3
    invoke-static {}, Le/b/a/e0/u/l;->b()Le/b/a/e0/u/l;

    move-result-object v1

    iput-object v1, v0, Le/b/a/c0/m;->c:Le/b/a/e0/u/l;

    move-object v1, p3

    .line 4
    iput-object v1, v0, Le/b/a/c0/m;->d:Ljava/lang/Object;

    move-object v1, p1

    .line 5
    iput-object v1, v0, Le/b/a/c0/m;->g:Landroid/content/Context;

    move-object v1, p2

    .line 6
    iput-object v1, v0, Le/b/a/c0/m;->h:Le/b/a/j;

    move-object v2, p4

    .line 7
    iput-object v2, v0, Le/b/a/c0/m;->i:Ljava/lang/Object;

    move-object v2, p5

    .line 8
    iput-object v2, v0, Le/b/a/c0/m;->j:Ljava/lang/Class;

    move-object v2, p6

    .line 9
    iput-object v2, v0, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    move v2, p7

    .line 10
    iput v2, v0, Le/b/a/c0/m;->l:I

    move v2, p8

    .line 11
    iput v2, v0, Le/b/a/c0/m;->m:I

    move-object v2, p9

    .line 12
    iput-object v2, v0, Le/b/a/c0/m;->n:Le/b/a/n;

    move-object v2, p10

    .line 13
    iput-object v2, v0, Le/b/a/c0/m;->o:Le/b/a/c0/o/h;

    move-object v2, p11

    .line 14
    iput-object v2, v0, Le/b/a/c0/m;->e:Le/b/a/c0/i;

    move-object v2, p12

    .line 15
    iput-object v2, v0, Le/b/a/c0/m;->p:Ljava/util/List;

    move-object/from16 v2, p13

    .line 16
    iput-object v2, v0, Le/b/a/c0/m;->f:Le/b/a/c0/f;

    move-object/from16 v2, p14

    .line 17
    iput-object v2, v0, Le/b/a/c0/m;->v:Le/b/a/y/x/j0;

    move-object/from16 v2, p15

    .line 18
    iput-object v2, v0, Le/b/a/c0/m;->q:Le/b/a/c0/p/e;

    move-object/from16 v2, p16

    .line 19
    iput-object v2, v0, Le/b/a/c0/m;->r:Ljava/util/concurrent/Executor;

    .line 20
    sget-object v2, Le/b/a/c0/l;->b:Le/b/a/c0/l;

    iput-object v2, v0, Le/b/a/c0/m;->w:Le/b/a/c0/l;

    .line 21
    iget-object v2, v0, Le/b/a/c0/m;->D:Ljava/lang/RuntimeException;

    if-nez v2, :cond_1

    invoke-virtual {p2}, Le/b/a/j;->e()Le/b/a/l;

    move-result-object v1

    const-class v2, Le/b/a/g;

    invoke-virtual {v1, v2}, Le/b/a/l;->a(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 22
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Glide request origin trace"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Le/b/a/c0/m;->D:Ljava/lang/RuntimeException;

    :cond_1
    return-void
.end method

.method public static a(IF)I
    .locals 1

    const/high16 v0, -0x80000000

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    int-to-float p0, p0

    mul-float p1, p1, p0

    .line 39
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p0

    :goto_0
    return p0
.end method

.method public static a(Landroid/content/Context;Le/b/a/j;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Le/b/a/c0/a;IILe/b/a/n;Le/b/a/c0/o/h;Le/b/a/c0/i;Ljava/util/List;Le/b/a/c0/f;Le/b/a/y/x/j0;Le/b/a/c0/p/e;Ljava/util/concurrent/Executor;)Le/b/a/c0/m;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/content/Context;",
            "Le/b/a/j;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "TR;>;",
            "Le/b/a/c0/a<",
            "*>;II",
            "Le/b/a/n;",
            "Le/b/a/c0/o/h<",
            "TR;>;",
            "Le/b/a/c0/i<",
            "TR;>;",
            "Ljava/util/List<",
            "Le/b/a/c0/i<",
            "TR;>;>;",
            "Le/b/a/c0/f;",
            "Le/b/a/y/x/j0;",
            "Le/b/a/c0/p/e<",
            "-TR;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Le/b/a/c0/m<",
            "TR;>;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    .line 1
    new-instance v17, Le/b/a/c0/m;

    move-object/from16 v0, v17

    invoke-direct/range {v0 .. v16}, Le/b/a/c0/m;-><init>(Landroid/content/Context;Le/b/a/j;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Le/b/a/c0/a;IILe/b/a/n;Le/b/a/c0/o/h;Le/b/a/c0/i;Ljava/util/List;Le/b/a/c0/f;Le/b/a/y/x/j0;Le/b/a/c0/p/e;Ljava/util/concurrent/Executor;)V

    return-object v17
.end method


# virtual methods
.method public final a(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 7
    iget-object v0, p0, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    invoke-virtual {v0}, Le/b/a/c0/a;->s()Landroid/content/res/Resources$Theme;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    invoke-virtual {v0}, Le/b/a/c0/a;->s()Landroid/content/res/Resources$Theme;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le/b/a/c0/m;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    .line 8
    :goto_0
    iget-object v1, p0, Le/b/a/c0/m;->g:Landroid/content/Context;

    invoke-static {v1, p1, v0}, Le/b/a/y/z/g/e;->a(Landroid/content/Context;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public a(II)V
    .locals 22

    move-object/from16 v15, p0

    .line 9
    iget-object v0, v15, Le/b/a/c0/m;->c:Le/b/a/e0/u/l;

    invoke-virtual {v0}, Le/b/a/e0/u/l;->a()V

    .line 10
    iget-object v14, v15, Le/b/a/c0/m;->d:Ljava/lang/Object;

    monitor-enter v14

    .line 11
    :try_start_0
    sget-boolean v0, Le/b/a/c0/m;->E:Z

    if-eqz v0, :cond_0

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Got onSizeReady in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, v15, Le/b/a/c0/m;->u:J

    invoke-static {v1, v2}, Le/b/a/e0/m;->a(J)D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v15, v0}, Le/b/a/c0/m;->a(Ljava/lang/String;)V

    .line 13
    :cond_0
    iget-object v0, v15, Le/b/a/c0/m;->w:Le/b/a/c0/l;

    sget-object v1, Le/b/a/c0/l;->d:Le/b/a/c0/l;

    if-eq v0, v1, :cond_1

    .line 14
    monitor-exit v14

    return-void

    .line 15
    :cond_1
    sget-object v0, Le/b/a/c0/l;->c:Le/b/a/c0/l;

    iput-object v0, v15, Le/b/a/c0/m;->w:Le/b/a/c0/l;

    .line 16
    iget-object v0, v15, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    invoke-virtual {v0}, Le/b/a/c0/a;->r()F

    move-result v0

    move/from16 v1, p1

    .line 17
    invoke-static {v1, v0}, Le/b/a/c0/m;->a(IF)I

    move-result v1

    iput v1, v15, Le/b/a/c0/m;->A:I

    move/from16 v1, p2

    .line 18
    invoke-static {v1, v0}, Le/b/a/c0/m;->a(IF)I

    move-result v0

    iput v0, v15, Le/b/a/c0/m;->B:I

    .line 19
    sget-boolean v0, Le/b/a/c0/m;->E:Z

    if-eqz v0, :cond_2

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "finished setup for calling load in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, v15, Le/b/a/c0/m;->u:J

    invoke-static {v1, v2}, Le/b/a/e0/m;->a(J)D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v15, v0}, Le/b/a/c0/m;->a(Ljava/lang/String;)V

    .line 21
    :cond_2
    iget-object v1, v15, Le/b/a/c0/m;->v:Le/b/a/y/x/j0;

    iget-object v2, v15, Le/b/a/c0/m;->h:Le/b/a/j;

    iget-object v3, v15, Le/b/a/c0/m;->i:Ljava/lang/Object;

    iget-object v0, v15, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    .line 22
    invoke-virtual {v0}, Le/b/a/c0/a;->q()Le/b/a/y/n;

    move-result-object v4

    iget v5, v15, Le/b/a/c0/m;->A:I

    iget v6, v15, Le/b/a/c0/m;->B:I

    iget-object v0, v15, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    .line 23
    invoke-virtual {v0}, Le/b/a/c0/a;->p()Ljava/lang/Class;

    move-result-object v7

    iget-object v8, v15, Le/b/a/c0/m;->j:Ljava/lang/Class;

    iget-object v9, v15, Le/b/a/c0/m;->n:Le/b/a/n;

    iget-object v0, v15, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    .line 24
    invoke-virtual {v0}, Le/b/a/c0/a;->d()Le/b/a/y/x/c0;

    move-result-object v10

    iget-object v0, v15, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    .line 25
    invoke-virtual {v0}, Le/b/a/c0/a;->t()Ljava/util/Map;

    move-result-object v11

    iget-object v0, v15, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    .line 26
    invoke-virtual {v0}, Le/b/a/c0/a;->B()Z

    move-result v12

    iget-object v0, v15, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    .line 27
    invoke-virtual {v0}, Le/b/a/c0/a;->z()Z

    move-result v13

    iget-object v0, v15, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    .line 28
    invoke-virtual {v0}, Le/b/a/c0/a;->j()Le/b/a/y/r;

    move-result-object v0

    move-object/from16 p1, v0

    iget-object v0, v15, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    .line 29
    invoke-virtual {v0}, Le/b/a/c0/a;->x()Z

    move-result v0

    move/from16 p2, v0

    iget-object v0, v15, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    .line 30
    invoke-virtual {v0}, Le/b/a/c0/a;->v()Z

    move-result v16

    iget-object v0, v15, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    .line 31
    invoke-virtual {v0}, Le/b/a/c0/a;->u()Z

    move-result v17

    iget-object v0, v15, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    .line 32
    invoke-virtual {v0}, Le/b/a/c0/a;->i()Z

    move-result v18

    iget-object v0, v15, Le/b/a/c0/m;->r:Ljava/util/concurrent/Executor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object/from16 v21, v14

    move-object/from16 v14, p1

    move/from16 v15, p2

    move-object/from16 v19, p0

    move-object/from16 v20, v0

    .line 33
    :try_start_1
    invoke-virtual/range {v1 .. v20}, Le/b/a/y/x/j0;->a(Le/b/a/j;Ljava/lang/Object;Le/b/a/y/n;IILjava/lang/Class;Ljava/lang/Class;Le/b/a/n;Le/b/a/y/x/c0;Ljava/util/Map;ZZLe/b/a/y/r;ZZZZLe/b/a/c0/k;Ljava/util/concurrent/Executor;)Le/b/a/y/x/i0;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v1, p0

    :try_start_2
    iput-object v0, v1, Le/b/a/c0/m;->t:Le/b/a/y/x/i0;

    .line 34
    iget-object v0, v1, Le/b/a/c0/m;->w:Le/b/a/c0/l;

    sget-object v2, Le/b/a/c0/l;->c:Le/b/a/c0/l;

    if-eq v0, v2, :cond_3

    const/4 v0, 0x0

    .line 35
    iput-object v0, v1, Le/b/a/c0/m;->t:Le/b/a/y/x/i0;

    .line 36
    :cond_3
    sget-boolean v0, Le/b/a/c0/m;->E:Z

    if-eqz v0, :cond_4

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "finished onSizeReady in "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v1, Le/b/a/c0/m;->u:J

    invoke-static {v2, v3}, Le/b/a/e0/m;->a(J)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Le/b/a/c0/m;->a(Ljava/lang/String;)V

    .line 38
    :cond_4
    monitor-exit v21

    return-void

    :catchall_0
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object/from16 v21, v14

    move-object v1, v15

    :goto_0
    monitor-exit v21
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    throw v0

    :catchall_2
    move-exception v0

    goto :goto_0
.end method

.method public a(Lcom/bumptech/glide/load/engine/GlideException;)V
    .locals 1

    const/4 v0, 0x5

    .line 88
    invoke-virtual {p0, p1, v0}, Le/b/a/c0/m;->a(Lcom/bumptech/glide/load/engine/GlideException;I)V

    return-void
.end method

.method public final a(Lcom/bumptech/glide/load/engine/GlideException;I)V
    .locals 8

    .line 89
    iget-object v0, p0, Le/b/a/c0/m;->c:Le/b/a/e0/u/l;

    invoke-virtual {v0}, Le/b/a/e0/u/l;->a()V

    .line 90
    iget-object v0, p0, Le/b/a/c0/m;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 91
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/m;->D:Ljava/lang/RuntimeException;

    invoke-virtual {p1, v1}, Lcom/bumptech/glide/load/engine/GlideException;->a(Ljava/lang/Exception;)V

    .line 92
    iget-object v1, p0, Le/b/a/c0/m;->h:Le/b/a/j;

    invoke-virtual {v1}, Le/b/a/j;->f()I

    move-result v1

    if-gt v1, p2, :cond_0

    const-string p2, "Glide"

    .line 93
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Load failed for ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Le/b/a/c0/m;->i:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "] with dimensions ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Le/b/a/c0/m;->A:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Le/b/a/c0/m;->B:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "]"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p2, 0x4

    if-gt v1, p2, :cond_0

    const-string p2, "Glide"

    .line 94
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/load/engine/GlideException;->a(Ljava/lang/String;)V

    :cond_0
    const/4 p2, 0x0

    .line 95
    iput-object p2, p0, Le/b/a/c0/m;->t:Le/b/a/y/x/i0;

    .line 96
    sget-object p2, Le/b/a/c0/l;->f:Le/b/a/c0/l;

    iput-object p2, p0, Le/b/a/c0/m;->w:Le/b/a/c0/l;

    .line 97
    invoke-virtual {p0}, Le/b/a/c0/m;->p()V

    const/4 p2, 0x1

    .line 98
    iput-boolean p2, p0, Le/b/a/c0/m;->C:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x0

    .line 99
    :try_start_1
    iget-object v2, p0, Le/b/a/c0/m;->p:Ljava/util/List;

    if-eqz v2, :cond_1

    .line 100
    iget-object v2, p0, Le/b/a/c0/m;->p:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le/b/a/c0/i;

    .line 101
    iget-object v5, p0, Le/b/a/c0/m;->i:Ljava/lang/Object;

    iget-object v6, p0, Le/b/a/c0/m;->o:Le/b/a/c0/o/h;

    .line 102
    invoke-virtual {p0}, Le/b/a/c0/m;->o()Z

    move-result v7

    invoke-interface {v4, p1, v5, v6, v7}, Le/b/a/c0/i;->a(Lcom/bumptech/glide/load/engine/GlideException;Ljava/lang/Object;Le/b/a/c0/o/h;Z)Z

    move-result v4

    or-int/2addr v3, v4

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 103
    :cond_2
    iget-object v2, p0, Le/b/a/c0/m;->e:Le/b/a/c0/i;

    if-eqz v2, :cond_3

    iget-object v2, p0, Le/b/a/c0/m;->e:Le/b/a/c0/i;

    iget-object v4, p0, Le/b/a/c0/m;->i:Ljava/lang/Object;

    iget-object v5, p0, Le/b/a/c0/m;->o:Le/b/a/c0/o/h;

    .line 104
    invoke-virtual {p0}, Le/b/a/c0/m;->o()Z

    move-result v6

    invoke-interface {v2, p1, v4, v5, v6}, Le/b/a/c0/i;->a(Lcom/bumptech/glide/load/engine/GlideException;Ljava/lang/Object;Le/b/a/c0/o/h;Z)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    :goto_1
    or-int p1, v3, p2

    if-nez p1, :cond_4

    .line 105
    invoke-virtual {p0}, Le/b/a/c0/m;->r()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    :cond_4
    :try_start_2
    iput-boolean v1, p0, Le/b/a/c0/m;->C:Z

    const-string p1, "GlideRequest"

    .line 107
    iget p2, p0, Le/b/a/c0/m;->a:I

    invoke-static {p1, p2}, Le/b/a/e0/u/i;->a(Ljava/lang/String;I)V

    .line 108
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 109
    iput-boolean v1, p0, Le/b/a/c0/m;->C:Z

    .line 110
    throw p1

    :catchall_1
    move-exception p1

    .line 111
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public a(Le/b/a/y/x/y0;Le/b/a/y/a;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/y0<",
            "*>;",
            "Le/b/a/y/a;",
            "Z)V"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Le/b/a/c0/m;->c:Le/b/a/e0/u/l;

    invoke-virtual {v0}, Le/b/a/e0/u/l;->a()V

    const/4 v0, 0x0

    .line 41
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/m;->d:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 42
    :try_start_1
    iput-object v0, p0, Le/b/a/c0/m;->t:Le/b/a/y/x/i0;

    if-nez p1, :cond_0

    .line 43
    new-instance p1, Lcom/bumptech/glide/load/engine/GlideException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Expected to receive a Resource<R> with an object of "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Le/b/a/c0/m;->j:Ljava/lang/Class;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " inside, but instead got null."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;)V

    .line 44
    invoke-virtual {p0, p1}, Le/b/a/c0/m;->a(Lcom/bumptech/glide/load/engine/GlideException;)V

    .line 45
    monitor-exit v1

    return-void

    .line 46
    :cond_0
    invoke-interface {p1}, Le/b/a/y/x/y0;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 47
    iget-object v3, p0, Le/b/a/c0/m;->j:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {p0}, Le/b/a/c0/m;->j()Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v3, :cond_3

    .line 49
    :try_start_2
    iput-object v0, p0, Le/b/a/c0/m;->s:Le/b/a/y/x/y0;

    .line 50
    sget-object p2, Le/b/a/c0/l;->e:Le/b/a/c0/l;

    iput-object p2, p0, Le/b/a/c0/m;->w:Le/b/a/c0/l;

    const-string p2, "GlideRequest"

    .line 51
    iget p3, p0, Le/b/a/c0/m;->a:I

    invoke-static {p2, p3}, Le/b/a/e0/u/i;->a(Ljava/lang/String;I)V

    .line 52
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p1, :cond_2

    .line 53
    iget-object p2, p0, Le/b/a/c0/m;->v:Le/b/a/y/x/j0;

    invoke-virtual {p2, p1}, Le/b/a/y/x/j0;->b(Le/b/a/y/x/y0;)V

    :cond_2
    return-void

    .line 54
    :cond_3
    :try_start_3
    invoke-virtual {p0, p1, v2, p2, p3}, Le/b/a/c0/m;->a(Le/b/a/y/x/y0;Ljava/lang/Object;Le/b/a/y/a;Z)V

    .line 55
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return-void

    .line 56
    :cond_4
    :goto_0
    :try_start_4
    iput-object v0, p0, Le/b/a/c0/m;->s:Le/b/a/y/x/y0;

    .line 57
    new-instance p2, Lcom/bumptech/glide/load/engine/GlideException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Expected to receive an object of "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Le/b/a/c0/m;->j:Ljava/lang/Class;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " but instead got "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v2, :cond_5

    .line 58
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_1

    :cond_5
    const-string v0, ""

    :goto_1
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "{"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "} inside Resource{"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "}."

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v2, :cond_6

    const-string v0, ""

    goto :goto_2

    :cond_6
    const-string v0, " To indicate failure return a null Resource object, rather than a Resource object containing null data."

    .line 59
    :goto_2
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;)V

    .line 60
    invoke-virtual {p0, p2}, Le/b/a/c0/m;->a(Lcom/bumptech/glide/load/engine/GlideException;)V

    .line 61
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz p1, :cond_7

    .line 62
    iget-object p2, p0, Le/b/a/c0/m;->v:Le/b/a/y/x/j0;

    invoke-virtual {p2, p1}, Le/b/a/y/x/j0;->b(Le/b/a/y/x/y0;)V

    :cond_7
    return-void

    :catchall_0
    move-exception p2

    move-object v0, p1

    move-object p1, p2

    goto :goto_3

    :catchall_1
    move-exception p1

    .line 63
    :goto_3
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p1

    if-eqz v0, :cond_8

    .line 64
    iget-object p2, p0, Le/b/a/c0/m;->v:Le/b/a/y/x/j0;

    invoke-virtual {p2, v0}, Le/b/a/y/x/j0;->b(Le/b/a/y/x/y0;)V

    .line 65
    :cond_8
    throw p1
.end method

.method public final a(Le/b/a/y/x/y0;Ljava/lang/Object;Le/b/a/y/a;Z)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/y0<",
            "TR;>;TR;",
            "Le/b/a/y/a;",
            "Z)V"
        }
    .end annotation

    .line 66
    invoke-virtual {p0}, Le/b/a/c0/m;->o()Z

    move-result p4

    .line 67
    sget-object v0, Le/b/a/c0/l;->e:Le/b/a/c0/l;

    iput-object v0, p0, Le/b/a/c0/m;->w:Le/b/a/c0/l;

    .line 68
    iput-object p1, p0, Le/b/a/c0/m;->s:Le/b/a/y/x/y0;

    .line 69
    iget-object p1, p0, Le/b/a/c0/m;->h:Le/b/a/j;

    invoke-virtual {p1}, Le/b/a/j;->f()I

    move-result p1

    const/4 v0, 0x3

    if-gt p1, v0, :cond_0

    .line 70
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Finished loading "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " from "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " for "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Le/b/a/c0/m;->i:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " with size ["

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Le/b/a/c0/m;->A:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "x"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Le/b/a/c0/m;->B:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "] in "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Le/b/a/c0/m;->u:J

    .line 72
    invoke-static {v0, v1}, Le/b/a/e0/m;->a(J)D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, " ms"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Glide"

    .line 73
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    :cond_0
    invoke-virtual {p0}, Le/b/a/c0/m;->q()V

    const/4 p1, 0x1

    .line 75
    iput-boolean p1, p0, Le/b/a/c0/m;->C:Z

    const/4 v6, 0x0

    .line 76
    :try_start_0
    iget-object v0, p0, Le/b/a/c0/m;->p:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 77
    iget-object v0, p0, Le/b/a/c0/m;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const/4 v8, 0x0

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/c0/i;

    .line 78
    iget-object v2, p0, Le/b/a/c0/m;->i:Ljava/lang/Object;

    iget-object v3, p0, Le/b/a/c0/m;->o:Le/b/a/c0/o/h;

    move-object v1, p2

    move-object v4, p3

    move v5, p4

    .line 79
    invoke-interface/range {v0 .. v5}, Le/b/a/c0/i;->a(Ljava/lang/Object;Ljava/lang/Object;Le/b/a/c0/o/h;Le/b/a/y/a;Z)Z

    move-result v0

    or-int/2addr v8, v0

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    .line 80
    :cond_2
    iget-object v0, p0, Le/b/a/c0/m;->e:Le/b/a/c0/i;

    if-eqz v0, :cond_3

    iget-object v0, p0, Le/b/a/c0/m;->e:Le/b/a/c0/i;

    iget-object v2, p0, Le/b/a/c0/m;->i:Ljava/lang/Object;

    iget-object v3, p0, Le/b/a/c0/m;->o:Le/b/a/c0/o/h;

    move-object v1, p2

    move-object v4, p3

    move v5, p4

    .line 81
    invoke-interface/range {v0 .. v5}, Le/b/a/c0/i;->a(Ljava/lang/Object;Ljava/lang/Object;Le/b/a/c0/o/h;Le/b/a/y/a;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    or-int/2addr p1, v8

    if-nez p1, :cond_4

    .line 82
    iget-object p1, p0, Le/b/a/c0/m;->q:Le/b/a/c0/p/e;

    invoke-interface {p1, p3, p4}, Le/b/a/c0/p/e;->a(Le/b/a/y/a;Z)Le/b/a/c0/p/d;

    move-result-object p1

    .line 83
    iget-object p3, p0, Le/b/a/c0/m;->o:Le/b/a/c0/o/h;

    invoke-interface {p3, p2, p1}, Le/b/a/c0/o/h;->a(Ljava/lang/Object;Le/b/a/c0/p/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    :cond_4
    iput-boolean v6, p0, Le/b/a/c0/m;->C:Z

    .line 85
    iget p1, p0, Le/b/a/c0/m;->a:I

    const-string p2, "GlideRequest"

    invoke-static {p2, p1}, Le/b/a/e0/u/i;->a(Ljava/lang/String;I)V

    return-void

    :catchall_0
    move-exception p1

    .line 86
    iput-boolean v6, p0, Le/b/a/c0/m;->C:Z

    .line 87
    throw p1
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget-object p1, p0, Le/b/a/c0/m;->p:Ljava/util/List;

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/c0/i;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " this: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Le/b/a/c0/m;->b:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "GlideRequest"

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public a()Z
    .locals 3

    .line 4
    iget-object v0, p0, Le/b/a/c0/m;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/m;->w:Le/b/a/c0/l;

    sget-object v2, Le/b/a/c0/l;->e:Le/b/a/c0/l;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public b()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/m;->c:Le/b/a/e0/u/l;

    invoke-virtual {v0}, Le/b/a/e0/u/l;->a()V

    .line 2
    iget-object v0, p0, Le/b/a/c0/m;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/c0/m;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Le/b/a/c0/m;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p0}, Le/b/a/c0/m;->clear()V

    .line 4
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public clear()V
    .locals 4

    .line 1
    iget-object v0, p0, Le/b/a/c0/m;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Le/b/a/c0/m;->g()V

    .line 3
    iget-object v1, p0, Le/b/a/c0/m;->c:Le/b/a/e0/u/l;

    invoke-virtual {v1}, Le/b/a/e0/u/l;->a()V

    .line 4
    iget-object v1, p0, Le/b/a/c0/m;->w:Le/b/a/c0/l;

    sget-object v2, Le/b/a/c0/l;->g:Le/b/a/c0/l;

    if-ne v1, v2, :cond_0

    .line 5
    monitor-exit v0

    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Le/b/a/c0/m;->k()V

    .line 7
    iget-object v1, p0, Le/b/a/c0/m;->s:Le/b/a/y/x/y0;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 8
    iget-object v1, p0, Le/b/a/c0/m;->s:Le/b/a/y/x/y0;

    .line 9
    iput-object v2, p0, Le/b/a/c0/m;->s:Le/b/a/y/x/y0;

    move-object v2, v1

    .line 10
    :cond_1
    invoke-virtual {p0}, Le/b/a/c0/m;->h()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 11
    iget-object v1, p0, Le/b/a/c0/m;->o:Le/b/a/c0/o/h;

    invoke-virtual {p0}, Le/b/a/c0/m;->n()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-interface {v1, v3}, Le/b/a/c0/o/h;->c(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    const-string v1, "GlideRequest"

    .line 12
    iget v3, p0, Le/b/a/c0/m;->a:I

    invoke-static {v1, v3}, Le/b/a/e0/u/i;->a(Ljava/lang/String;I)V

    .line 13
    sget-object v1, Le/b/a/c0/l;->g:Le/b/a/c0/l;

    iput-object v1, p0, Le/b/a/c0/m;->w:Le/b/a/c0/l;

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    .line 15
    iget-object v0, p0, Le/b/a/c0/m;->v:Le/b/a/y/x/j0;

    invoke-virtual {v0, v2}, Le/b/a/y/x/j0;->b(Le/b/a/y/x/y0;)V

    :cond_3
    return-void

    :catchall_0
    move-exception v1

    .line 16
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public d()V
    .locals 4

    .line 1
    iget-object v0, p0, Le/b/a/c0/m;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Le/b/a/c0/m;->g()V

    .line 3
    iget-object v1, p0, Le/b/a/c0/m;->c:Le/b/a/e0/u/l;

    invoke-virtual {v1}, Le/b/a/e0/u/l;->a()V

    .line 4
    invoke-static {}, Le/b/a/e0/m;->a()J

    move-result-wide v1

    iput-wide v1, p0, Le/b/a/c0/m;->u:J

    .line 5
    iget-object v1, p0, Le/b/a/c0/m;->i:Ljava/lang/Object;

    if-nez v1, :cond_2

    .line 6
    iget v1, p0, Le/b/a/c0/m;->l:I

    iget v2, p0, Le/b/a/c0/m;->m:I

    invoke-static {v1, v2}, Le/b/a/e0/t;->b(II)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7
    iget v1, p0, Le/b/a/c0/m;->l:I

    iput v1, p0, Le/b/a/c0/m;->A:I

    .line 8
    iget v1, p0, Le/b/a/c0/m;->m:I

    iput v1, p0, Le/b/a/c0/m;->B:I

    .line 9
    :cond_0
    invoke-virtual {p0}, Le/b/a/c0/m;->m()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v1, 0x5

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    .line 10
    :goto_0
    new-instance v2, Lcom/bumptech/glide/load/engine/GlideException;

    const-string v3, "Received null model"

    invoke-direct {v2, v3}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v2, v1}, Le/b/a/c0/m;->a(Lcom/bumptech/glide/load/engine/GlideException;I)V

    .line 11
    monitor-exit v0

    return-void

    .line 12
    :cond_2
    iget-object v1, p0, Le/b/a/c0/m;->w:Le/b/a/c0/l;

    sget-object v2, Le/b/a/c0/l;->c:Le/b/a/c0/l;

    if-eq v1, v2, :cond_8

    .line 13
    iget-object v1, p0, Le/b/a/c0/m;->w:Le/b/a/c0/l;

    sget-object v2, Le/b/a/c0/l;->e:Le/b/a/c0/l;

    if-ne v1, v2, :cond_3

    .line 14
    iget-object v1, p0, Le/b/a/c0/m;->s:Le/b/a/y/x/y0;

    sget-object v2, Le/b/a/y/a;->f:Le/b/a/y/a;

    const/4 v3, 0x0

    invoke-virtual {p0, v1, v2, v3}, Le/b/a/c0/m;->a(Le/b/a/y/x/y0;Le/b/a/y/a;Z)V

    .line 15
    monitor-exit v0

    return-void

    .line 16
    :cond_3
    iget-object v1, p0, Le/b/a/c0/m;->i:Ljava/lang/Object;

    invoke-virtual {p0, v1}, Le/b/a/c0/m;->a(Ljava/lang/Object;)V

    const-string v1, "GlideRequest"

    .line 17
    invoke-static {v1}, Le/b/a/e0/u/i;->b(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Le/b/a/c0/m;->a:I

    .line 18
    sget-object v1, Le/b/a/c0/l;->d:Le/b/a/c0/l;

    iput-object v1, p0, Le/b/a/c0/m;->w:Le/b/a/c0/l;

    .line 19
    iget v1, p0, Le/b/a/c0/m;->l:I

    iget v2, p0, Le/b/a/c0/m;->m:I

    invoke-static {v1, v2}, Le/b/a/e0/t;->b(II)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 20
    iget v1, p0, Le/b/a/c0/m;->l:I

    iget v2, p0, Le/b/a/c0/m;->m:I

    invoke-virtual {p0, v1, v2}, Le/b/a/c0/m;->a(II)V

    goto :goto_1

    .line 21
    :cond_4
    iget-object v1, p0, Le/b/a/c0/m;->o:Le/b/a/c0/o/h;

    invoke-interface {v1, p0}, Le/b/a/c0/o/h;->b(Le/b/a/c0/o/g;)V

    .line 22
    :goto_1
    iget-object v1, p0, Le/b/a/c0/m;->w:Le/b/a/c0/l;

    sget-object v2, Le/b/a/c0/l;->c:Le/b/a/c0/l;

    if-eq v1, v2, :cond_5

    iget-object v1, p0, Le/b/a/c0/m;->w:Le/b/a/c0/l;

    sget-object v2, Le/b/a/c0/l;->d:Le/b/a/c0/l;

    if-ne v1, v2, :cond_6

    .line 23
    :cond_5
    invoke-virtual {p0}, Le/b/a/c0/m;->i()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 24
    iget-object v1, p0, Le/b/a/c0/m;->o:Le/b/a/c0/o/h;

    invoke-virtual {p0}, Le/b/a/c0/m;->n()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-interface {v1, v2}, Le/b/a/c0/o/h;->a(Landroid/graphics/drawable/Drawable;)V

    .line 25
    :cond_6
    sget-boolean v1, Le/b/a/c0/m;->E:Z

    if-eqz v1, :cond_7

    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "finished run method in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Le/b/a/c0/m;->u:J

    invoke-static {v2, v3}, Le/b/a/e0/m;->a(J)D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Le/b/a/c0/m;->a(Ljava/lang/String;)V

    .line 27
    :cond_7
    monitor-exit v0

    return-void

    .line 28
    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot restart a running request"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 29
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public d(Le/b/a/c0/d;)Z
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 30
    instance-of v2, v0, Le/b/a/c0/m;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    .line 31
    :cond_0
    iget-object v2, v1, Le/b/a/c0/m;->d:Ljava/lang/Object;

    monitor-enter v2

    .line 32
    :try_start_0
    iget v4, v1, Le/b/a/c0/m;->l:I

    .line 33
    iget v5, v1, Le/b/a/c0/m;->m:I

    .line 34
    iget-object v6, v1, Le/b/a/c0/m;->i:Ljava/lang/Object;

    .line 35
    iget-object v7, v1, Le/b/a/c0/m;->j:Ljava/lang/Class;

    .line 36
    iget-object v8, v1, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    .line 37
    iget-object v9, v1, Le/b/a/c0/m;->n:Le/b/a/n;

    .line 38
    iget-object v10, v1, Le/b/a/c0/m;->p:Ljava/util/List;

    if-eqz v10, :cond_1

    iget-object v10, v1, Le/b/a/c0/m;->p:Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    goto :goto_0

    :cond_1
    const/4 v10, 0x0

    .line 39
    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 40
    check-cast v0, Le/b/a/c0/m;

    .line 41
    iget-object v11, v0, Le/b/a/c0/m;->d:Ljava/lang/Object;

    monitor-enter v11

    .line 42
    :try_start_1
    iget v2, v0, Le/b/a/c0/m;->l:I

    .line 43
    iget v12, v0, Le/b/a/c0/m;->m:I

    .line 44
    iget-object v13, v0, Le/b/a/c0/m;->i:Ljava/lang/Object;

    .line 45
    iget-object v14, v0, Le/b/a/c0/m;->j:Ljava/lang/Class;

    .line 46
    iget-object v15, v0, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    .line 47
    iget-object v3, v0, Le/b/a/c0/m;->n:Le/b/a/n;

    .line 48
    iget-object v1, v0, Le/b/a/c0/m;->p:Ljava/util/List;

    if-eqz v1, :cond_2

    iget-object v0, v0, Le/b/a/c0/m;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 49
    :goto_1
    monitor-exit v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v4, v2, :cond_3

    if-ne v5, v12, :cond_3

    .line 50
    invoke-static {v6, v13}, Le/b/a/e0/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 51
    invoke-virtual {v7, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 52
    invoke-virtual {v8, v15}, Le/b/a/c0/a;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    if-ne v9, v3, :cond_3

    if-ne v10, v0, :cond_3

    const/4 v3, 0x1

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :goto_2
    return v3

    :catchall_0
    move-exception v0

    .line 53
    :try_start_2
    monitor-exit v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v0

    .line 54
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public e()Z
    .locals 3

    .line 1
    iget-object v0, p0, Le/b/a/c0/m;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/m;->w:Le/b/a/c0/l;

    sget-object v2, Le/b/a/c0/l;->e:Le/b/a/c0/l;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public f()Z
    .locals 3

    .line 1
    iget-object v0, p0, Le/b/a/c0/m;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/m;->w:Le/b/a/c0/l;

    sget-object v2, Le/b/a/c0/l;->g:Le/b/a/c0/l;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final g()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Le/b/a/c0/m;->C:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You can\'t start or clear loads in RequestListener or Target callbacks. If you\'re trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/m;->f:Le/b/a/c0/f;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Le/b/a/c0/f;->f(Le/b/a/c0/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/m;->f:Le/b/a/c0/f;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Le/b/a/c0/f;->e(Le/b/a/c0/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public isRunning()Z
    .locals 3

    .line 1
    iget-object v0, p0, Le/b/a/c0/m;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/m;->w:Le/b/a/c0/l;

    sget-object v2, Le/b/a/c0/l;->c:Le/b/a/c0/l;

    if-eq v1, v2, :cond_1

    iget-object v1, p0, Le/b/a/c0/m;->w:Le/b/a/c0/l;

    sget-object v2, Le/b/a/c0/l;->d:Le/b/a/c0/l;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final j()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/m;->f:Le/b/a/c0/f;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Le/b/a/c0/f;->a(Le/b/a/c0/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final k()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/b/a/c0/m;->g()V

    .line 2
    iget-object v0, p0, Le/b/a/c0/m;->c:Le/b/a/e0/u/l;

    invoke-virtual {v0}, Le/b/a/e0/u/l;->a()V

    .line 3
    iget-object v0, p0, Le/b/a/c0/m;->o:Le/b/a/c0/o/h;

    invoke-interface {v0, p0}, Le/b/a/c0/o/h;->a(Le/b/a/c0/o/g;)V

    .line 4
    iget-object v0, p0, Le/b/a/c0/m;->t:Le/b/a/y/x/i0;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Le/b/a/y/x/i0;->a()V

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Le/b/a/c0/m;->t:Le/b/a/y/x/i0;

    :cond_0
    return-void
.end method

.method public final l()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/m;->x:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    invoke-virtual {v0}, Le/b/a/c0/a;->f()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Le/b/a/c0/m;->x:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    invoke-virtual {v0}, Le/b/a/c0/a;->e()I

    move-result v0

    if-lez v0, :cond_0

    .line 4
    iget-object v0, p0, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    invoke-virtual {v0}, Le/b/a/c0/a;->e()I

    move-result v0

    invoke-virtual {p0, v0}, Le/b/a/c0/m;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Le/b/a/c0/m;->x:Landroid/graphics/drawable/Drawable;

    .line 5
    :cond_0
    iget-object v0, p0, Le/b/a/c0/m;->x:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final m()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/m;->z:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    invoke-virtual {v0}, Le/b/a/c0/a;->g()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Le/b/a/c0/m;->z:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    invoke-virtual {v0}, Le/b/a/c0/a;->h()I

    move-result v0

    if-lez v0, :cond_0

    .line 4
    iget-object v0, p0, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    invoke-virtual {v0}, Le/b/a/c0/a;->h()I

    move-result v0

    invoke-virtual {p0, v0}, Le/b/a/c0/m;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Le/b/a/c0/m;->z:Landroid/graphics/drawable/Drawable;

    .line 5
    :cond_0
    iget-object v0, p0, Le/b/a/c0/m;->z:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final n()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/m;->y:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    invoke-virtual {v0}, Le/b/a/c0/a;->m()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Le/b/a/c0/m;->y:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    invoke-virtual {v0}, Le/b/a/c0/a;->n()I

    move-result v0

    if-lez v0, :cond_0

    .line 4
    iget-object v0, p0, Le/b/a/c0/m;->k:Le/b/a/c0/a;

    invoke-virtual {v0}, Le/b/a/c0/a;->n()I

    move-result v0

    invoke-virtual {p0, v0}, Le/b/a/c0/m;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Le/b/a/c0/m;->y:Landroid/graphics/drawable/Drawable;

    .line 5
    :cond_0
    iget-object v0, p0, Le/b/a/c0/m;->y:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/m;->f:Le/b/a/c0/f;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Le/b/a/c0/f;->b()Le/b/a/c0/f;

    move-result-object v0

    invoke-interface {v0}, Le/b/a/c0/f;->a()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final p()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/m;->f:Le/b/a/c0/f;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p0}, Le/b/a/c0/f;->b(Le/b/a/c0/d;)V

    :cond_0
    return-void
.end method

.method public final q()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/m;->f:Le/b/a/c0/f;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p0}, Le/b/a/c0/f;->c(Le/b/a/c0/d;)V

    :cond_0
    return-void
.end method

.method public final r()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/b/a/c0/m;->i()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Le/b/a/c0/m;->i:Ljava/lang/Object;

    if-nez v1, :cond_1

    .line 3
    invoke-virtual {p0}, Le/b/a/c0/m;->m()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :cond_1
    if-nez v0, :cond_2

    .line 4
    invoke-virtual {p0}, Le/b/a/c0/m;->l()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :cond_2
    if-nez v0, :cond_3

    .line 5
    invoke-virtual {p0}, Le/b/a/c0/m;->n()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 6
    :cond_3
    iget-object v1, p0, Le/b/a/c0/m;->o:Le/b/a/c0/o/h;

    invoke-interface {v1, v0}, Le/b/a/c0/o/h;->b(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Le/b/a/c0/m;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/m;->i:Ljava/lang/Object;

    .line 3
    iget-object v2, p0, Le/b/a/c0/m;->j:Ljava/lang/Class;

    .line 4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "[model="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transcodeClass="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    .line 6
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
