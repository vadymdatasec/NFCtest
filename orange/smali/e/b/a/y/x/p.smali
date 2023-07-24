.class public Le/b/a/y/x/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/x/k;
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements Le/b/a/e0/u/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/b/a/y/x/p$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/y/x/k;",
        "Ljava/lang/Runnable;",
        "Ljava/lang/Comparable<",
        "Le/b/a/y/x/p<",
        "*>;>;",
        "Le/b/a/e0/u/f;"
    }
.end annotation


# instance fields
.field public A:Ljava/lang/Object;

.field public B:Le/b/a/y/a;

.field public C:Le/b/a/y/w/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/w/e<",
            "*>;"
        }
    .end annotation
.end field

.field public volatile D:Le/b/a/y/x/l;

.field public volatile E:Z

.field public volatile F:Z

.field public G:Z

.field public final b:Le/b/a/y/x/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/x/m<",
            "TR;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Le/b/a/e0/u/l;

.field public final e:Le/b/a/y/x/r;

.field public final f:Lc/h/m/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/h/m/d<",
            "Le/b/a/y/x/p<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final g:Le/b/a/y/x/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/x/q<",
            "*>;"
        }
    .end annotation
.end field

.field public final h:Le/b/a/y/x/s;

.field public i:Le/b/a/j;

.field public j:Le/b/a/y/n;

.field public k:Le/b/a/n;

.field public l:Le/b/a/y/x/p0;

.field public m:I

.field public n:I

.field public o:Le/b/a/y/x/c0;

.field public p:Le/b/a/y/r;

.field public q:Le/b/a/y/x/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/x/o<",
            "TR;>;"
        }
    .end annotation
.end field

.field public r:I

.field public s:Le/b/a/y/x/u;

.field public t:Le/b/a/y/x/t;

.field public u:J

.field public v:Z

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Thread;

.field public y:Le/b/a/y/n;

.field public z:Le/b/a/y/n;


# direct methods
.method public constructor <init>(Le/b/a/y/x/r;Lc/h/m/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/r;",
            "Lc/h/m/d<",
            "Le/b/a/y/x/p<",
            "*>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/b/a/y/x/m;

    invoke-direct {v0}, Le/b/a/y/x/m;-><init>()V

    iput-object v0, p0, Le/b/a/y/x/p;->b:Le/b/a/y/x/m;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/b/a/y/x/p;->c:Ljava/util/List;

    .line 4
    invoke-static {}, Le/b/a/e0/u/l;->b()Le/b/a/e0/u/l;

    move-result-object v0

    iput-object v0, p0, Le/b/a/y/x/p;->d:Le/b/a/e0/u/l;

    .line 5
    new-instance v0, Le/b/a/y/x/q;

    invoke-direct {v0}, Le/b/a/y/x/q;-><init>()V

    iput-object v0, p0, Le/b/a/y/x/p;->g:Le/b/a/y/x/q;

    .line 6
    new-instance v0, Le/b/a/y/x/s;

    invoke-direct {v0}, Le/b/a/y/x/s;-><init>()V

    iput-object v0, p0, Le/b/a/y/x/p;->h:Le/b/a/y/x/s;

    .line 7
    iput-object p1, p0, Le/b/a/y/x/p;->e:Le/b/a/y/x/r;

    .line 8
    iput-object p2, p0, Le/b/a/y/x/p;->f:Lc/h/m/d;

    return-void
.end method


# virtual methods
.method public a(Le/b/a/y/x/p;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/p<",
            "*>;)I"
        }
    .end annotation

    .line 17
    invoke-virtual {p0}, Le/b/a/y/x/p;->f()I

    move-result v0

    invoke-virtual {p1}, Le/b/a/y/x/p;->f()I

    move-result v1

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    .line 18
    iget v0, p0, Le/b/a/y/x/p;->r:I

    iget p1, p1, Le/b/a/y/x/p;->r:I

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public a()Le/b/a/e0/u/l;
    .locals 1

    .line 81
    iget-object v0, p0, Le/b/a/y/x/p;->d:Le/b/a/e0/u/l;

    return-object v0
.end method

.method public final a(Le/b/a/y/a;)Le/b/a/y/r;
    .locals 3

    .line 61
    iget-object v0, p0, Le/b/a/y/x/p;->p:Le/b/a/y/r;

    .line 62
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-ge v1, v2, :cond_0

    return-object v0

    .line 63
    :cond_0
    sget-object v1, Le/b/a/y/a;->e:Le/b/a/y/a;

    if-eq p1, v1, :cond_2

    iget-object p1, p0, Le/b/a/y/x/p;->b:Le/b/a/y/x/m;

    .line 64
    invoke-virtual {p1}, Le/b/a/y/x/m;->o()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 65
    :goto_1
    sget-object v1, Le/b/a/y/z/e/x;->i:Le/b/a/y/q;

    invoke-virtual {v0, v1}, Le/b/a/y/r;->a(Le/b/a/y/q;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    if-eqz v1, :cond_4

    .line 66
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    if-eqz p1, :cond_4

    :cond_3
    return-object v0

    .line 67
    :cond_4
    new-instance v0, Le/b/a/y/r;

    invoke-direct {v0}, Le/b/a/y/r;-><init>()V

    .line 68
    iget-object v1, p0, Le/b/a/y/x/p;->p:Le/b/a/y/r;

    invoke-virtual {v0, v1}, Le/b/a/y/r;->a(Le/b/a/y/r;)V

    .line 69
    sget-object v1, Le/b/a/y/z/e/x;->i:Le/b/a/y/q;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Le/b/a/y/r;->a(Le/b/a/y/q;Ljava/lang/Object;)Le/b/a/y/r;

    return-object v0
.end method

.method public a(Le/b/a/j;Ljava/lang/Object;Le/b/a/y/x/p0;Le/b/a/y/n;IILjava/lang/Class;Ljava/lang/Class;Le/b/a/n;Le/b/a/y/x/c0;Ljava/util/Map;ZZZLe/b/a/y/r;Le/b/a/y/x/o;I)Le/b/a/y/x/p;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/j;",
            "Ljava/lang/Object;",
            "Le/b/a/y/x/p0;",
            "Le/b/a/y/n;",
            "II",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "TR;>;",
            "Le/b/a/n;",
            "Le/b/a/y/x/c0;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Le/b/a/y/v<",
            "*>;>;ZZZ",
            "Le/b/a/y/r;",
            "Le/b/a/y/x/o<",
            "TR;>;I)",
            "Le/b/a/y/x/p<",
            "TR;>;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Le/b/a/y/x/p;->b:Le/b/a/y/x/m;

    iget-object v15, v0, Le/b/a/y/x/p;->e:Le/b/a/y/x/r;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p10

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p15

    move-object/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    invoke-virtual/range {v1 .. v15}, Le/b/a/y/x/m;->a(Le/b/a/j;Ljava/lang/Object;Le/b/a/y/n;IILe/b/a/y/x/c0;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/n;Le/b/a/y/r;Ljava/util/Map;ZZLe/b/a/y/x/r;)V

    move-object/from16 v1, p1

    .line 2
    iput-object v1, v0, Le/b/a/y/x/p;->i:Le/b/a/j;

    move-object/from16 v1, p4

    .line 3
    iput-object v1, v0, Le/b/a/y/x/p;->j:Le/b/a/y/n;

    move-object/from16 v1, p9

    .line 4
    iput-object v1, v0, Le/b/a/y/x/p;->k:Le/b/a/n;

    move-object/from16 v1, p3

    .line 5
    iput-object v1, v0, Le/b/a/y/x/p;->l:Le/b/a/y/x/p0;

    move/from16 v1, p5

    .line 6
    iput v1, v0, Le/b/a/y/x/p;->m:I

    move/from16 v1, p6

    .line 7
    iput v1, v0, Le/b/a/y/x/p;->n:I

    move-object/from16 v1, p10

    .line 8
    iput-object v1, v0, Le/b/a/y/x/p;->o:Le/b/a/y/x/c0;

    move/from16 v1, p14

    .line 9
    iput-boolean v1, v0, Le/b/a/y/x/p;->v:Z

    move-object/from16 v1, p15

    .line 10
    iput-object v1, v0, Le/b/a/y/x/p;->p:Le/b/a/y/r;

    move-object/from16 v1, p16

    .line 11
    iput-object v1, v0, Le/b/a/y/x/p;->q:Le/b/a/y/x/o;

    move/from16 v1, p17

    .line 12
    iput v1, v0, Le/b/a/y/x/p;->r:I

    .line 13
    sget-object v1, Le/b/a/y/x/t;->b:Le/b/a/y/x/t;

    iput-object v1, v0, Le/b/a/y/x/p;->t:Le/b/a/y/x/t;

    move-object/from16 v1, p2

    .line 14
    iput-object v1, v0, Le/b/a/y/x/p;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public final a(Le/b/a/y/x/u;)Le/b/a/y/x/u;
    .locals 3

    .line 21
    sget-object v0, Le/b/a/y/x/n;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 22
    iget-object p1, p0, Le/b/a/y/x/p;->o:Le/b/a/y/x/c0;

    invoke-virtual {p1}, Le/b/a/y/x/c0;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 23
    sget-object p1, Le/b/a/y/x/u;->c:Le/b/a/y/x/u;

    goto :goto_0

    .line 24
    :cond_0
    sget-object p1, Le/b/a/y/x/u;->c:Le/b/a/y/x/u;

    invoke-virtual {p0, p1}, Le/b/a/y/x/p;->a(Le/b/a/y/x/u;)Le/b/a/y/x/u;

    move-result-object p1

    :goto_0
    return-object p1

    .line 25
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unrecognized stage: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 26
    :cond_2
    sget-object p1, Le/b/a/y/x/u;->g:Le/b/a/y/x/u;

    return-object p1

    .line 27
    :cond_3
    iget-boolean p1, p0, Le/b/a/y/x/p;->v:Z

    if-eqz p1, :cond_4

    sget-object p1, Le/b/a/y/x/u;->g:Le/b/a/y/x/u;

    goto :goto_1

    :cond_4
    sget-object p1, Le/b/a/y/x/u;->e:Le/b/a/y/x/u;

    :goto_1
    return-object p1

    .line 28
    :cond_5
    iget-object p1, p0, Le/b/a/y/x/p;->o:Le/b/a/y/x/c0;

    invoke-virtual {p1}, Le/b/a/y/x/c0;->a()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 29
    sget-object p1, Le/b/a/y/x/u;->d:Le/b/a/y/x/u;

    goto :goto_2

    .line 30
    :cond_6
    sget-object p1, Le/b/a/y/x/u;->d:Le/b/a/y/x/u;

    invoke-virtual {p0, p1}, Le/b/a/y/x/p;->a(Le/b/a/y/x/u;)Le/b/a/y/x/u;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public a(Le/b/a/y/a;Le/b/a/y/x/y0;)Le/b/a/y/x/y0;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Z:",
            "Ljava/lang/Object;",
            ">(",
            "Le/b/a/y/a;",
            "Le/b/a/y/x/y0<",
            "TZ;>;)",
            "Le/b/a/y/x/y0<",
            "TZ;>;"
        }
    .end annotation

    .line 82
    invoke-interface {p2}, Le/b/a/y/x/y0;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    .line 83
    sget-object v0, Le/b/a/y/a;->e:Le/b/a/y/a;

    const/4 v1, 0x0

    if-eq p1, v0, :cond_0

    .line 84
    iget-object v0, p0, Le/b/a/y/x/p;->b:Le/b/a/y/x/m;

    invoke-virtual {v0, v8}, Le/b/a/y/x/m;->b(Ljava/lang/Class;)Le/b/a/y/v;

    move-result-object v0

    .line 85
    iget-object v2, p0, Le/b/a/y/x/p;->i:Le/b/a/j;

    iget v3, p0, Le/b/a/y/x/p;->m:I

    iget v4, p0, Le/b/a/y/x/p;->n:I

    invoke-interface {v0, v2, p2, v3, v4}, Le/b/a/y/v;->a(Landroid/content/Context;Le/b/a/y/x/y0;II)Le/b/a/y/x/y0;

    move-result-object v2

    move-object v7, v0

    move-object v0, v2

    goto :goto_0

    :cond_0
    move-object v0, p2

    move-object v7, v1

    .line 86
    :goto_0
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 87
    invoke-interface {p2}, Le/b/a/y/x/y0;->d()V

    .line 88
    :cond_1
    iget-object p2, p0, Le/b/a/y/x/p;->b:Le/b/a/y/x/m;

    invoke-virtual {p2, v0}, Le/b/a/y/x/m;->b(Le/b/a/y/x/y0;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 89
    iget-object p2, p0, Le/b/a/y/x/p;->b:Le/b/a/y/x/m;

    invoke-virtual {p2, v0}, Le/b/a/y/x/m;->a(Le/b/a/y/x/y0;)Le/b/a/y/u;

    move-result-object v1

    .line 90
    iget-object p2, p0, Le/b/a/y/x/p;->p:Le/b/a/y/r;

    invoke-interface {v1, p2}, Le/b/a/y/u;->a(Le/b/a/y/r;)Le/b/a/y/c;

    move-result-object p2

    goto :goto_1

    .line 91
    :cond_2
    sget-object p2, Le/b/a/y/c;->d:Le/b/a/y/c;

    :goto_1
    move-object v10, v1

    .line 92
    iget-object v1, p0, Le/b/a/y/x/p;->b:Le/b/a/y/x/m;

    iget-object v2, p0, Le/b/a/y/x/p;->y:Le/b/a/y/n;

    invoke-virtual {v1, v2}, Le/b/a/y/x/m;->a(Le/b/a/y/n;)Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    .line 93
    iget-object v3, p0, Le/b/a/y/x/p;->o:Le/b/a/y/x/c0;

    invoke-virtual {v3, v1, p1, p2}, Le/b/a/y/x/c0;->a(ZLe/b/a/y/a;Le/b/a/y/c;)Z

    move-result p1

    if-eqz p1, :cond_6

    if-eqz v10, :cond_5

    .line 94
    sget-object p1, Le/b/a/y/x/n;->c:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget p1, p1, v1

    if-eq p1, v2, :cond_4

    const/4 v1, 0x2

    if-ne p1, v1, :cond_3

    .line 95
    new-instance p1, Le/b/a/y/x/a1;

    iget-object p2, p0, Le/b/a/y/x/p;->b:Le/b/a/y/x/m;

    .line 96
    invoke-virtual {p2}, Le/b/a/y/x/m;->b()Le/b/a/y/x/f1/b;

    move-result-object v2

    iget-object v3, p0, Le/b/a/y/x/p;->y:Le/b/a/y/n;

    iget-object v4, p0, Le/b/a/y/x/p;->j:Le/b/a/y/n;

    iget v5, p0, Le/b/a/y/x/p;->m:I

    iget v6, p0, Le/b/a/y/x/p;->n:I

    iget-object v9, p0, Le/b/a/y/x/p;->p:Le/b/a/y/r;

    move-object v1, p1

    invoke-direct/range {v1 .. v9}, Le/b/a/y/x/a1;-><init>(Le/b/a/y/x/f1/b;Le/b/a/y/n;Le/b/a/y/n;IILe/b/a/y/v;Ljava/lang/Class;Le/b/a/y/r;)V

    goto :goto_2

    .line 97
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown strategy: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 98
    :cond_4
    new-instance p1, Le/b/a/y/x/i;

    iget-object p2, p0, Le/b/a/y/x/p;->y:Le/b/a/y/n;

    iget-object v1, p0, Le/b/a/y/x/p;->j:Le/b/a/y/n;

    invoke-direct {p1, p2, v1}, Le/b/a/y/x/i;-><init>(Le/b/a/y/n;Le/b/a/y/n;)V

    .line 99
    :goto_2
    invoke-static {v0}, Le/b/a/y/x/x0;->b(Le/b/a/y/x/y0;)Le/b/a/y/x/x0;

    move-result-object v0

    .line 100
    iget-object p2, p0, Le/b/a/y/x/p;->g:Le/b/a/y/x/q;

    invoke-virtual {p2, p1, v10, v0}, Le/b/a/y/x/q;->a(Le/b/a/y/n;Le/b/a/y/u;Le/b/a/y/x/x0;)V

    goto :goto_3

    .line 101
    :cond_5
    new-instance p1, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;

    invoke-interface {v0}, Le/b/a/y/x/y0;->get()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;-><init>(Ljava/lang/Class;)V

    throw p1

    :cond_6
    :goto_3
    return-object v0
.end method

.method public final a(Le/b/a/y/w/e;Ljava/lang/Object;Le/b/a/y/a;)Le/b/a/y/x/y0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            ">(",
            "Le/b/a/y/w/e<",
            "*>;TData;",
            "Le/b/a/y/a;",
            ")",
            "Le/b/a/y/x/y0<",
            "TR;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bumptech/glide/load/engine/GlideException;
        }
    .end annotation

    if-nez p2, :cond_0

    const/4 p2, 0x0

    .line 52
    invoke-interface {p1}, Le/b/a/y/w/e;->b()V

    return-object p2

    .line 53
    :cond_0
    :try_start_0
    invoke-static {}, Le/b/a/e0/m;->a()J

    move-result-wide v0

    .line 54
    invoke-virtual {p0, p2, p3}, Le/b/a/y/x/p;->a(Ljava/lang/Object;Le/b/a/y/a;)Le/b/a/y/x/y0;

    move-result-object p2

    const-string p3, "DecodeJob"

    const/4 v2, 0x2

    .line 55
    invoke-static {p3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 56
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Decoded result "

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3, v0, v1}, Le/b/a/y/x/p;->a(Ljava/lang/String;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    :cond_1
    invoke-interface {p1}, Le/b/a/y/w/e;->b()V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-interface {p1}, Le/b/a/y/w/e;->b()V

    .line 58
    throw p2
.end method

.method public final a(Ljava/lang/Object;Le/b/a/y/a;)Le/b/a/y/x/y0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            ">(TData;",
            "Le/b/a/y/a;",
            ")",
            "Le/b/a/y/x/y0<",
            "TR;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bumptech/glide/load/engine/GlideException;
        }
    .end annotation

    .line 59
    iget-object v0, p0, Le/b/a/y/x/p;->b:Le/b/a/y/x/m;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/b/a/y/x/m;->a(Ljava/lang/Class;)Le/b/a/y/x/v0;

    move-result-object v0

    .line 60
    invoke-virtual {p0, p1, p2, v0}, Le/b/a/y/x/p;->a(Ljava/lang/Object;Le/b/a/y/a;Le/b/a/y/x/v0;)Le/b/a/y/x/y0;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/Object;Le/b/a/y/a;Le/b/a/y/x/v0;)Le/b/a/y/x/y0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            "ResourceType:",
            "Ljava/lang/Object;",
            ">(TData;",
            "Le/b/a/y/a;",
            "Le/b/a/y/x/v0<",
            "TData;TResourceType;TR;>;)",
            "Le/b/a/y/x/y0<",
            "TR;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bumptech/glide/load/engine/GlideException;
        }
    .end annotation

    .line 70
    invoke-virtual {p0, p2}, Le/b/a/y/x/p;->a(Le/b/a/y/a;)Le/b/a/y/r;

    move-result-object v2

    .line 71
    iget-object v0, p0, Le/b/a/y/x/p;->i:Le/b/a/j;

    invoke-virtual {v0}, Le/b/a/j;->g()Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/Registry;->b(Ljava/lang/Object;)Le/b/a/y/w/g;

    move-result-object p1

    .line 72
    :try_start_0
    iget v3, p0, Le/b/a/y/x/p;->m:I

    iget v4, p0, Le/b/a/y/x/p;->n:I

    new-instance v5, Le/b/a/y/x/p$a;

    invoke-direct {v5, p0, p2}, Le/b/a/y/x/p$a;-><init>(Le/b/a/y/x/p;Le/b/a/y/a;)V

    move-object v0, p3

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Le/b/a/y/x/v0;->a(Le/b/a/y/w/g;Le/b/a/y/r;IILe/b/a/y/x/v;)Le/b/a/y/x/y0;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    invoke-interface {p1}, Le/b/a/y/w/g;->b()V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-interface {p1}, Le/b/a/y/w/g;->b()V

    .line 74
    throw p2
.end method

.method public a(Le/b/a/y/n;Ljava/lang/Exception;Le/b/a/y/w/e;Le/b/a/y/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/n;",
            "Ljava/lang/Exception;",
            "Le/b/a/y/w/e<",
            "*>;",
            "Le/b/a/y/a;",
            ")V"
        }
    .end annotation

    .line 45
    invoke-interface {p3}, Le/b/a/y/w/e;->b()V

    .line 46
    new-instance v0, Lcom/bumptech/glide/load/engine/GlideException;

    const-string v1, "Fetching data failed"

    invoke-direct {v0, v1, p2}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    invoke-interface {p3}, Le/b/a/y/w/e;->a()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p1, p4, p2}, Lcom/bumptech/glide/load/engine/GlideException;->a(Le/b/a/y/n;Le/b/a/y/a;Ljava/lang/Class;)V

    .line 48
    iget-object p1, p0, Le/b/a/y/x/p;->c:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object p2, p0, Le/b/a/y/x/p;->x:Ljava/lang/Thread;

    if-eq p1, p2, :cond_0

    .line 50
    sget-object p1, Le/b/a/y/x/t;->c:Le/b/a/y/x/t;

    invoke-virtual {p0, p1}, Le/b/a/y/x/p;->a(Le/b/a/y/x/t;)V

    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {p0}, Le/b/a/y/x/p;->k()V

    :goto_0
    return-void
.end method

.method public a(Le/b/a/y/n;Ljava/lang/Object;Le/b/a/y/w/e;Le/b/a/y/a;Le/b/a/y/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/n;",
            "Ljava/lang/Object;",
            "Le/b/a/y/w/e<",
            "*>;",
            "Le/b/a/y/a;",
            "Le/b/a/y/n;",
            ")V"
        }
    .end annotation

    .line 33
    iput-object p1, p0, Le/b/a/y/x/p;->y:Le/b/a/y/n;

    .line 34
    iput-object p2, p0, Le/b/a/y/x/p;->A:Ljava/lang/Object;

    .line 35
    iput-object p3, p0, Le/b/a/y/x/p;->C:Le/b/a/y/w/e;

    .line 36
    iput-object p4, p0, Le/b/a/y/x/p;->B:Le/b/a/y/a;

    .line 37
    iput-object p5, p0, Le/b/a/y/x/p;->z:Le/b/a/y/n;

    .line 38
    iget-object p2, p0, Le/b/a/y/x/p;->b:Le/b/a/y/x/m;

    invoke-virtual {p2}, Le/b/a/y/x/m;->c()Ljava/util/List;

    move-result-object p2

    const/4 p3, 0x0

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    if-eq p1, p2, :cond_0

    const/4 p3, 0x1

    :cond_0
    iput-boolean p3, p0, Le/b/a/y/x/p;->G:Z

    .line 39
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object p2, p0, Le/b/a/y/x/p;->x:Ljava/lang/Thread;

    if-eq p1, p2, :cond_1

    .line 40
    sget-object p1, Le/b/a/y/x/t;->d:Le/b/a/y/x/t;

    invoke-virtual {p0, p1}, Le/b/a/y/x/p;->a(Le/b/a/y/x/t;)V

    goto :goto_0

    :cond_1
    const-string p1, "DecodeJob.decodeFromRetrievedData"

    .line 41
    invoke-static {p1}, Le/b/a/e0/u/i;->a(Ljava/lang/String;)V

    .line 42
    :try_start_0
    invoke-virtual {p0}, Le/b/a/y/x/p;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    invoke-static {}, Le/b/a/e0/u/i;->a()V

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, Le/b/a/e0/u/i;->a()V

    .line 44
    throw p1
.end method

.method public final a(Le/b/a/y/x/t;)V
    .locals 0

    .line 31
    iput-object p1, p0, Le/b/a/y/x/p;->t:Le/b/a/y/x/t;

    .line 32
    iget-object p1, p0, Le/b/a/y/x/p;->q:Le/b/a/y/x/o;

    invoke-interface {p1, p0}, Le/b/a/y/x/o;->a(Le/b/a/y/x/p;)V

    return-void
.end method

.method public final a(Le/b/a/y/x/y0;Le/b/a/y/a;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/y0<",
            "TR;>;",
            "Le/b/a/y/a;",
            "Z)V"
        }
    .end annotation

    .line 19
    invoke-virtual {p0}, Le/b/a/y/x/p;->m()V

    .line 20
    iget-object v0, p0, Le/b/a/y/x/p;->q:Le/b/a/y/x/o;

    invoke-interface {v0, p1, p2, p3}, Le/b/a/y/x/o;->a(Le/b/a/y/x/y0;Le/b/a/y/a;Z)V

    return-void
.end method

.method public final a(Ljava/lang/String;J)V
    .locals 1

    const/4 v0, 0x0

    .line 75
    invoke-virtual {p0, p1, p2, p3, v0}, Le/b/a/y/x/p;->a(Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/String;JLjava/lang/String;)V
    .locals 1

    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " in "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    invoke-static {p2, p3}, Le/b/a/e0/m;->a(J)D

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p1, ", load key: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Le/b/a/y/x/p;->l:Le/b/a/y/x/p0;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    if-eqz p4, :cond_0

    .line 78
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, ", "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", thread: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "DecodeJob"

    .line 80
    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 15
    iget-object v0, p0, Le/b/a/y/x/p;->h:Le/b/a/y/x/s;

    invoke-virtual {v0, p1}, Le/b/a/y/x/s;->b(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 16
    invoke-virtual {p0}, Le/b/a/y/x/p;->j()V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    sget-object v0, Le/b/a/y/x/t;->c:Le/b/a/y/x/t;

    invoke-virtual {p0, v0}, Le/b/a/y/x/p;->a(Le/b/a/y/x/t;)V

    return-void
.end method

.method public final b(Le/b/a/y/x/y0;Le/b/a/y/a;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/y0<",
            "TR;>;",
            "Le/b/a/y/a;",
            "Z)V"
        }
    .end annotation

    const-string v0, "DecodeJob.notifyEncodeAndRelease"

    .line 2
    invoke-static {v0}, Le/b/a/e0/u/i;->a(Ljava/lang/String;)V

    .line 3
    :try_start_0
    instance-of v0, p1, Le/b/a/y/x/t0;

    if-eqz v0, :cond_0

    .line 4
    move-object v0, p1

    check-cast v0, Le/b/a/y/x/t0;

    invoke-interface {v0}, Le/b/a/y/x/t0;->a()V

    :cond_0
    const/4 v0, 0x0

    .line 5
    iget-object v1, p0, Le/b/a/y/x/p;->g:Le/b/a/y/x/q;

    invoke-virtual {v1}, Le/b/a/y/x/q;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    invoke-static {p1}, Le/b/a/y/x/x0;->b(Le/b/a/y/x/y0;)Le/b/a/y/x/x0;

    move-result-object p1

    move-object v0, p1

    .line 7
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Le/b/a/y/x/p;->a(Le/b/a/y/x/y0;Le/b/a/y/a;Z)V

    .line 8
    sget-object p1, Le/b/a/y/x/u;->f:Le/b/a/y/x/u;

    iput-object p1, p0, Le/b/a/y/x/p;->s:Le/b/a/y/x/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    :try_start_1
    iget-object p1, p0, Le/b/a/y/x/p;->g:Le/b/a/y/x/q;

    invoke-virtual {p1}, Le/b/a/y/x/q;->b()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 10
    iget-object p1, p0, Le/b/a/y/x/p;->g:Le/b/a/y/x/q;

    iget-object p2, p0, Le/b/a/y/x/p;->e:Le/b/a/y/x/r;

    iget-object p3, p0, Le/b/a/y/x/p;->p:Le/b/a/y/r;

    invoke-virtual {p1, p2, p3}, Le/b/a/y/x/q;->a(Le/b/a/y/x/r;Le/b/a/y/r;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    if-eqz v0, :cond_3

    .line 11
    :try_start_2
    invoke-virtual {v0}, Le/b/a/y/x/x0;->f()V

    .line 12
    :cond_3
    invoke-virtual {p0}, Le/b/a/y/x/p;->h()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 13
    invoke-static {}, Le/b/a/e0/u/i;->a()V

    return-void

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_4

    .line 14
    :try_start_3
    invoke-virtual {v0}, Le/b/a/y/x/x0;->f()V

    .line 15
    :cond_4
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    .line 16
    invoke-static {}, Le/b/a/e0/u/i;->a()V

    .line 17
    throw p1
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Le/b/a/y/x/p;->F:Z

    .line 2
    iget-object v0, p0, Le/b/a/y/x/p;->D:Le/b/a/y/x/l;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Le/b/a/y/x/l;->cancel()V

    :cond_0
    return-void
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Le/b/a/y/x/p;

    invoke-virtual {p0, p1}, Le/b/a/y/x/p;->a(Le/b/a/y/x/p;)I

    move-result p1

    return p1
.end method

.method public final d()V
    .locals 4

    const-string v0, "DecodeJob"

    const/4 v1, 0x2

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-wide v0, p0, Le/b/a/y/x/p;->u:J

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "data: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Le/b/a/y/x/p;->A:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", cache key: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Le/b/a/y/x/p;->y:Le/b/a/y/n;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", fetcher: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Le/b/a/y/x/p;->C:Le/b/a/y/w/e;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Retrieved data"

    invoke-virtual {p0, v3, v0, v1, v2}, Le/b/a/y/x/p;->a(Ljava/lang/String;JLjava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    .line 3
    :try_start_0
    iget-object v1, p0, Le/b/a/y/x/p;->C:Le/b/a/y/w/e;

    iget-object v2, p0, Le/b/a/y/x/p;->A:Ljava/lang/Object;

    iget-object v3, p0, Le/b/a/y/x/p;->B:Le/b/a/y/a;

    invoke-virtual {p0, v1, v2, v3}, Le/b/a/y/x/p;->a(Le/b/a/y/w/e;Ljava/lang/Object;Le/b/a/y/a;)Le/b/a/y/x/y0;

    move-result-object v0
    :try_end_0
    .catch Lcom/bumptech/glide/load/engine/GlideException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 4
    iget-object v2, p0, Le/b/a/y/x/p;->z:Le/b/a/y/n;

    iget-object v3, p0, Le/b/a/y/x/p;->B:Le/b/a/y/a;

    invoke-virtual {v1, v2, v3}, Lcom/bumptech/glide/load/engine/GlideException;->a(Le/b/a/y/n;Le/b/a/y/a;)V

    .line 5
    iget-object v2, p0, Le/b/a/y/x/p;->c:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    if-eqz v0, :cond_1

    .line 6
    iget-object v1, p0, Le/b/a/y/x/p;->B:Le/b/a/y/a;

    iget-boolean v2, p0, Le/b/a/y/x/p;->G:Z

    invoke-virtual {p0, v0, v1, v2}, Le/b/a/y/x/p;->b(Le/b/a/y/x/y0;Le/b/a/y/a;Z)V

    goto :goto_1

    .line 7
    :cond_1
    invoke-virtual {p0}, Le/b/a/y/x/p;->k()V

    :goto_1
    return-void
.end method

.method public final e()Le/b/a/y/x/l;
    .locals 3

    .line 1
    sget-object v0, Le/b/a/y/x/n;->b:[I

    iget-object v1, p0, Le/b/a/y/x/p;->s:Le/b/a/y/x/u;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unrecognized stage: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/b/a/y/x/p;->s:Le/b/a/y/x/u;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3
    :cond_1
    new-instance v0, Le/b/a/y/x/e1;

    iget-object v1, p0, Le/b/a/y/x/p;->b:Le/b/a/y/x/m;

    invoke-direct {v0, v1, p0}, Le/b/a/y/x/e1;-><init>(Le/b/a/y/x/m;Le/b/a/y/x/k;)V

    return-object v0

    .line 4
    :cond_2
    new-instance v0, Le/b/a/y/x/h;

    iget-object v1, p0, Le/b/a/y/x/p;->b:Le/b/a/y/x/m;

    invoke-direct {v0, v1, p0}, Le/b/a/y/x/h;-><init>(Le/b/a/y/x/m;Le/b/a/y/x/k;)V

    return-object v0

    .line 5
    :cond_3
    new-instance v0, Le/b/a/y/x/z0;

    iget-object v1, p0, Le/b/a/y/x/p;->b:Le/b/a/y/x/m;

    invoke-direct {v0, v1, p0}, Le/b/a/y/x/z0;-><init>(Le/b/a/y/x/m;Le/b/a/y/x/k;)V

    return-object v0
.end method

.method public final f()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/p;->k:Le/b/a/n;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method public final g()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Le/b/a/y/x/p;->m()V

    .line 2
    new-instance v0, Lcom/bumptech/glide/load/engine/GlideException;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Le/b/a/y/x/p;->c:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v2, "Failed to load resource"

    invoke-direct {v0, v2, v1}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 3
    iget-object v1, p0, Le/b/a/y/x/p;->q:Le/b/a/y/x/o;

    invoke-interface {v1, v0}, Le/b/a/y/x/o;->a(Lcom/bumptech/glide/load/engine/GlideException;)V

    .line 4
    invoke-virtual {p0}, Le/b/a/y/x/p;->i()V

    return-void
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/p;->h:Le/b/a/y/x/s;

    invoke-virtual {v0}, Le/b/a/y/x/s;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Le/b/a/y/x/p;->j()V

    :cond_0
    return-void
.end method

.method public final i()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/p;->h:Le/b/a/y/x/s;

    invoke-virtual {v0}, Le/b/a/y/x/s;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Le/b/a/y/x/p;->j()V

    :cond_0
    return-void
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Le/b/a/y/x/p;->h:Le/b/a/y/x/s;

    invoke-virtual {v0}, Le/b/a/y/x/s;->c()V

    .line 2
    iget-object v0, p0, Le/b/a/y/x/p;->g:Le/b/a/y/x/q;

    invoke-virtual {v0}, Le/b/a/y/x/q;->a()V

    .line 3
    iget-object v0, p0, Le/b/a/y/x/p;->b:Le/b/a/y/x/m;

    invoke-virtual {v0}, Le/b/a/y/x/m;->a()V

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Le/b/a/y/x/p;->E:Z

    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Le/b/a/y/x/p;->i:Le/b/a/j;

    .line 6
    iput-object v1, p0, Le/b/a/y/x/p;->j:Le/b/a/y/n;

    .line 7
    iput-object v1, p0, Le/b/a/y/x/p;->p:Le/b/a/y/r;

    .line 8
    iput-object v1, p0, Le/b/a/y/x/p;->k:Le/b/a/n;

    .line 9
    iput-object v1, p0, Le/b/a/y/x/p;->l:Le/b/a/y/x/p0;

    .line 10
    iput-object v1, p0, Le/b/a/y/x/p;->q:Le/b/a/y/x/o;

    .line 11
    iput-object v1, p0, Le/b/a/y/x/p;->s:Le/b/a/y/x/u;

    .line 12
    iput-object v1, p0, Le/b/a/y/x/p;->D:Le/b/a/y/x/l;

    .line 13
    iput-object v1, p0, Le/b/a/y/x/p;->x:Ljava/lang/Thread;

    .line 14
    iput-object v1, p0, Le/b/a/y/x/p;->y:Le/b/a/y/n;

    .line 15
    iput-object v1, p0, Le/b/a/y/x/p;->A:Ljava/lang/Object;

    .line 16
    iput-object v1, p0, Le/b/a/y/x/p;->B:Le/b/a/y/a;

    .line 17
    iput-object v1, p0, Le/b/a/y/x/p;->C:Le/b/a/y/w/e;

    const-wide/16 v2, 0x0

    .line 18
    iput-wide v2, p0, Le/b/a/y/x/p;->u:J

    .line 19
    iput-boolean v0, p0, Le/b/a/y/x/p;->F:Z

    .line 20
    iput-object v1, p0, Le/b/a/y/x/p;->w:Ljava/lang/Object;

    .line 21
    iget-object v0, p0, Le/b/a/y/x/p;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 22
    iget-object v0, p0, Le/b/a/y/x/p;->f:Lc/h/m/d;

    invoke-interface {v0, p0}, Lc/h/m/d;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method public final k()V
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Le/b/a/y/x/p;->x:Ljava/lang/Thread;

    .line 2
    invoke-static {}, Le/b/a/e0/m;->a()J

    move-result-wide v0

    iput-wide v0, p0, Le/b/a/y/x/p;->u:J

    const/4 v0, 0x0

    .line 3
    :cond_0
    iget-boolean v1, p0, Le/b/a/y/x/p;->F:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Le/b/a/y/x/p;->D:Le/b/a/y/x/l;

    if-eqz v1, :cond_1

    iget-object v0, p0, Le/b/a/y/x/p;->D:Le/b/a/y/x/l;

    .line 4
    invoke-interface {v0}, Le/b/a/y/x/l;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    iget-object v1, p0, Le/b/a/y/x/p;->s:Le/b/a/y/x/u;

    invoke-virtual {p0, v1}, Le/b/a/y/x/p;->a(Le/b/a/y/x/u;)Le/b/a/y/x/u;

    move-result-object v1

    iput-object v1, p0, Le/b/a/y/x/p;->s:Le/b/a/y/x/u;

    .line 6
    invoke-virtual {p0}, Le/b/a/y/x/p;->e()Le/b/a/y/x/l;

    move-result-object v1

    iput-object v1, p0, Le/b/a/y/x/p;->D:Le/b/a/y/x/l;

    .line 7
    iget-object v1, p0, Le/b/a/y/x/p;->s:Le/b/a/y/x/u;

    sget-object v2, Le/b/a/y/x/u;->e:Le/b/a/y/x/u;

    if-ne v1, v2, :cond_0

    .line 8
    sget-object v0, Le/b/a/y/x/t;->c:Le/b/a/y/x/t;

    invoke-virtual {p0, v0}, Le/b/a/y/x/p;->a(Le/b/a/y/x/t;)V

    return-void

    .line 9
    :cond_1
    iget-object v1, p0, Le/b/a/y/x/p;->s:Le/b/a/y/x/u;

    sget-object v2, Le/b/a/y/x/u;->g:Le/b/a/y/x/u;

    if-eq v1, v2, :cond_2

    iget-boolean v1, p0, Le/b/a/y/x/p;->F:Z

    if-eqz v1, :cond_3

    :cond_2
    if-nez v0, :cond_3

    .line 10
    invoke-virtual {p0}, Le/b/a/y/x/p;->g()V

    :cond_3
    return-void
.end method

.method public final l()V
    .locals 3

    .line 1
    sget-object v0, Le/b/a/y/x/n;->a:[I

    iget-object v1, p0, Le/b/a/y/x/p;->t:Le/b/a/y/x/t;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Le/b/a/y/x/p;->d()V

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unrecognized run reason: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/b/a/y/x/p;->t:Le/b/a/y/x/t;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4
    :cond_1
    invoke-virtual {p0}, Le/b/a/y/x/p;->k()V

    goto :goto_0

    .line 5
    :cond_2
    sget-object v0, Le/b/a/y/x/u;->b:Le/b/a/y/x/u;

    invoke-virtual {p0, v0}, Le/b/a/y/x/p;->a(Le/b/a/y/x/u;)Le/b/a/y/x/u;

    move-result-object v0

    iput-object v0, p0, Le/b/a/y/x/p;->s:Le/b/a/y/x/u;

    .line 6
    invoke-virtual {p0}, Le/b/a/y/x/p;->e()Le/b/a/y/x/l;

    move-result-object v0

    iput-object v0, p0, Le/b/a/y/x/p;->D:Le/b/a/y/x/l;

    .line 7
    invoke-virtual {p0}, Le/b/a/y/x/p;->k()V

    :goto_0
    return-void
.end method

.method public final m()V
    .locals 3

    .line 1
    iget-object v0, p0, Le/b/a/y/x/p;->d:Le/b/a/e0/u/l;

    invoke-virtual {v0}, Le/b/a/e0/u/l;->a()V

    .line 2
    iget-boolean v0, p0, Le/b/a/y/x/p;->E:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Le/b/a/y/x/p;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le/b/a/y/x/p;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    .line 4
    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Already notified"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 5
    :cond_1
    iput-boolean v1, p0, Le/b/a/y/x/p;->E:Z

    return-void
.end method

.method public n()Z
    .locals 2

    .line 1
    sget-object v0, Le/b/a/y/x/u;->b:Le/b/a/y/x/u;

    invoke-virtual {p0, v0}, Le/b/a/y/x/p;->a(Le/b/a/y/x/u;)Le/b/a/y/x/u;

    move-result-object v0

    .line 2
    sget-object v1, Le/b/a/y/x/u;->c:Le/b/a/y/x/u;

    if-eq v0, v1, :cond_1

    sget-object v1, Le/b/a/y/x/u;->d:Le/b/a/y/x/u;

    if-ne v0, v1, :cond_0

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

.method public run()V
    .locals 5

    const-string v0, "DecodeJob"

    .line 1
    iget-object v1, p0, Le/b/a/y/x/p;->t:Le/b/a/y/x/t;

    iget-object v2, p0, Le/b/a/y/x/p;->w:Ljava/lang/Object;

    const-string v3, "DecodeJob#run(reason=%s, model=%s)"

    invoke-static {v3, v1, v2}, Le/b/a/e0/u/i;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2
    iget-object v1, p0, Le/b/a/y/x/p;->C:Le/b/a/y/w/e;

    .line 3
    :try_start_0
    iget-boolean v2, p0, Le/b/a/y/x/p;->F:Z

    if-eqz v2, :cond_1

    .line 4
    invoke-virtual {p0}, Le/b/a/y/x/p;->g()V
    :try_end_0
    .catch Le/b/a/y/x/g; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 5
    invoke-interface {v1}, Le/b/a/y/w/e;->b()V

    .line 6
    :cond_0
    invoke-static {}, Le/b/a/e0/u/i;->a()V

    return-void

    .line 7
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Le/b/a/y/x/p;->l()V
    :try_end_1
    .catch Le/b/a/y/x/g; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_2

    .line 8
    invoke-interface {v1}, Le/b/a/y/w/e;->b()V

    .line 9
    :cond_2
    invoke-static {}, Le/b/a/e0/u/i;->a()V

    return-void

    :catchall_0
    move-exception v2

    const/4 v3, 0x3

    .line 10
    :try_start_2
    invoke-static {v0, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 11
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "DecodeJob threw unexpectedly, isCancelled: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v4, p0, Le/b/a/y/x/p;->F:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ", stage: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Le/b/a/y/x/p;->s:Le/b/a/y/x/u;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 12
    :cond_3
    iget-object v0, p0, Le/b/a/y/x/p;->s:Le/b/a/y/x/u;

    sget-object v3, Le/b/a/y/x/u;->f:Le/b/a/y/x/u;

    if-eq v0, v3, :cond_4

    .line 13
    iget-object v0, p0, Le/b/a/y/x/p;->c:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    invoke-virtual {p0}, Le/b/a/y/x/p;->g()V

    .line 15
    :cond_4
    iget-boolean v0, p0, Le/b/a/y/x/p;->F:Z

    if-nez v0, :cond_5

    .line 16
    throw v2

    .line 17
    :cond_5
    throw v2

    :catch_0
    move-exception v0

    .line 18
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    if-eqz v1, :cond_6

    .line 19
    invoke-interface {v1}, Le/b/a/y/w/e;->b()V

    .line 20
    :cond_6
    invoke-static {}, Le/b/a/e0/u/i;->a()V

    .line 21
    throw v0
.end method
