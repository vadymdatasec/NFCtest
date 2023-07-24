.class public abstract Le/b/a/c0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Le/b/a/c0/a<",
        "TT;>;>",
        "Ljava/lang/Object;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# instance fields
.field public A:Z

.field public b:I

.field public c:F

.field public d:Le/b/a/y/x/c0;

.field public e:Le/b/a/n;

.field public f:Landroid/graphics/drawable/Drawable;

.field public g:I

.field public h:Landroid/graphics/drawable/Drawable;

.field public i:I

.field public j:Z

.field public k:I

.field public l:I

.field public m:Le/b/a/y/n;

.field public n:Z

.field public o:Z

.field public p:Landroid/graphics/drawable/Drawable;

.field public q:I

.field public r:Le/b/a/y/r;

.field public s:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Le/b/a/y/v<",
            "*>;>;"
        }
    .end annotation
.end field

.field public t:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public u:Z

.field public v:Landroid/content/res/Resources$Theme;

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    iput v0, p0, Le/b/a/c0/a;->c:F

    .line 3
    sget-object v0, Le/b/a/y/x/c0;->c:Le/b/a/y/x/c0;

    iput-object v0, p0, Le/b/a/c0/a;->d:Le/b/a/y/x/c0;

    .line 4
    sget-object v0, Le/b/a/n;->d:Le/b/a/n;

    iput-object v0, p0, Le/b/a/c0/a;->e:Le/b/a/n;

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Le/b/a/c0/a;->j:Z

    const/4 v1, -0x1

    .line 6
    iput v1, p0, Le/b/a/c0/a;->k:I

    .line 7
    iput v1, p0, Le/b/a/c0/a;->l:I

    .line 8
    invoke-static {}, Le/b/a/d0/c;->a()Le/b/a/d0/c;

    move-result-object v1

    iput-object v1, p0, Le/b/a/c0/a;->m:Le/b/a/y/n;

    .line 9
    iput-boolean v0, p0, Le/b/a/c0/a;->o:Z

    .line 10
    new-instance v1, Le/b/a/y/r;

    invoke-direct {v1}, Le/b/a/y/r;-><init>()V

    iput-object v1, p0, Le/b/a/c0/a;->r:Le/b/a/y/r;

    .line 11
    new-instance v1, Le/b/a/e0/d;

    invoke-direct {v1}, Le/b/a/e0/d;-><init>()V

    iput-object v1, p0, Le/b/a/c0/a;->s:Ljava/util/Map;

    .line 12
    const-class v1, Ljava/lang/Object;

    iput-object v1, p0, Le/b/a/c0/a;->t:Ljava/lang/Class;

    .line 13
    iput-boolean v0, p0, Le/b/a/c0/a;->z:Z

    return-void
.end method

.method public static b(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public final A()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/b/a/c0/a;->o:Z

    return v0
.end method

.method public final B()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/b/a/c0/a;->n:Z

    return v0
.end method

.method public final C()Z
    .locals 1

    const/16 v0, 0x800

    .line 1
    invoke-virtual {p0, v0}, Le/b/a/c0/a;->a(I)Z

    move-result v0

    return v0
.end method

.method public final D()Z
    .locals 2

    .line 1
    iget v0, p0, Le/b/a/c0/a;->l:I

    iget v1, p0, Le/b/a/c0/a;->k:I

    invoke-static {v0, v1}, Le/b/a/e0/t;->b(II)Z

    move-result v0

    return v0
.end method

.method public E()Le/b/a/c0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Le/b/a/c0/a;->u:Z

    .line 2
    invoke-virtual {p0}, Le/b/a/c0/a;->I()Le/b/a/c0/a;

    return-object p0
.end method

.method public F()Le/b/a/c0/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    sget-object v0, Le/b/a/y/z/e/u;->c:Le/b/a/y/z/e/u;

    new-instance v1, Le/b/a/y/z/e/i;

    invoke-direct {v1}, Le/b/a/y/z/e/i;-><init>()V

    invoke-virtual {p0, v0, v1}, Le/b/a/c0/a;->b(Le/b/a/y/z/e/u;Le/b/a/y/v;)Le/b/a/c0/a;

    move-result-object v0

    return-object v0
.end method

.method public G()Le/b/a/c0/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    sget-object v0, Le/b/a/y/z/e/u;->b:Le/b/a/y/z/e/u;

    new-instance v1, Le/b/a/y/z/e/j;

    invoke-direct {v1}, Le/b/a/y/z/e/j;-><init>()V

    invoke-virtual {p0, v0, v1}, Le/b/a/c0/a;->a(Le/b/a/y/z/e/u;Le/b/a/y/v;)Le/b/a/c0/a;

    move-result-object v0

    return-object v0
.end method

.method public H()Le/b/a/c0/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    sget-object v0, Le/b/a/y/z/e/u;->a:Le/b/a/y/z/e/u;

    new-instance v1, Le/b/a/y/z/e/c0;

    invoke-direct {v1}, Le/b/a/y/z/e/c0;-><init>()V

    invoke-virtual {p0, v0, v1}, Le/b/a/c0/a;->a(Le/b/a/y/z/e/u;Le/b/a/y/v;)Le/b/a/c0/a;

    move-result-object v0

    return-object v0
.end method

.method public final I()Le/b/a/c0/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    return-object p0
.end method

.method public final J()Le/b/a/c0/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Le/b/a/c0/a;->u:Z

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Le/b/a/c0/a;->I()Le/b/a/c0/a;

    return-object p0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot modify locked T, consider clone()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a()Le/b/a/c0/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 146
    iget-boolean v0, p0, Le/b/a/c0/a;->u:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Le/b/a/c0/a;->w:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 147
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot auto lock an already locked options object, try clone() first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 148
    iput-boolean v0, p0, Le/b/a/c0/a;->w:Z

    .line 149
    invoke-virtual {p0}, Le/b/a/c0/a;->E()Le/b/a/c0/a;

    move-result-object v0

    return-object v0
.end method

.method public a(F)Le/b/a/c0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Le/b/a/c0/a;->w:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Le/b/a/c0/a;->clone()Le/b/a/c0/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/b/a/c0/a;->a(F)Le/b/a/c0/a;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-gtz v0, :cond_1

    .line 3
    iput p1, p0, Le/b/a/c0/a;->c:F

    .line 4
    iget p1, p0, Le/b/a/c0/a;->b:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Le/b/a/c0/a;->b:I

    .line 5
    invoke-virtual {p0}, Le/b/a/c0/a;->J()Le/b/a/c0/a;

    return-object p0

    .line 6
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "sizeMultiplier must be between 0 and 1"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(II)Le/b/a/c0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)TT;"
        }
    .end annotation

    .line 29
    iget-boolean v0, p0, Le/b/a/c0/a;->w:Z

    if-eqz v0, :cond_0

    .line 30
    invoke-virtual {p0}, Le/b/a/c0/a;->clone()Le/b/a/c0/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Le/b/a/c0/a;->a(II)Le/b/a/c0/a;

    move-result-object p1

    return-object p1

    .line 31
    :cond_0
    iput p1, p0, Le/b/a/c0/a;->l:I

    .line 32
    iput p2, p0, Le/b/a/c0/a;->k:I

    .line 33
    iget p1, p0, Le/b/a/c0/a;->b:I

    or-int/lit16 p1, p1, 0x200

    iput p1, p0, Le/b/a/c0/a;->b:I

    .line 34
    invoke-virtual {p0}, Le/b/a/c0/a;->J()Le/b/a/c0/a;

    return-object p0
.end method

.method public a(Landroid/content/res/Resources$Theme;)Le/b/a/c0/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources$Theme;",
            ")TT;"
        }
    .end annotation

    .line 17
    iget-boolean v0, p0, Le/b/a/c0/a;->w:Z

    if-eqz v0, :cond_0

    .line 18
    invoke-virtual {p0}, Le/b/a/c0/a;->clone()Le/b/a/c0/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/b/a/c0/a;->a(Landroid/content/res/Resources$Theme;)Le/b/a/c0/a;

    move-result-object p1

    return-object p1

    .line 19
    :cond_0
    iput-object p1, p0, Le/b/a/c0/a;->v:Landroid/content/res/Resources$Theme;

    if-eqz p1, :cond_1

    .line 20
    iget v0, p0, Le/b/a/c0/a;->b:I

    const v1, 0x8000

    or-int/2addr v0, v1

    iput v0, p0, Le/b/a/c0/a;->b:I

    .line 21
    sget-object v0, Le/b/a/y/z/g/h;->b:Le/b/a/y/q;

    invoke-virtual {p0, v0, p1}, Le/b/a/c0/a;->a(Le/b/a/y/q;Ljava/lang/Object;)Le/b/a/c0/a;

    move-result-object p1

    return-object p1

    .line 22
    :cond_1
    iget p1, p0, Le/b/a/c0/a;->b:I

    const v0, -0x8001

    and-int/2addr p1, v0

    iput p1, p0, Le/b/a/c0/a;->b:I

    .line 23
    sget-object p1, Le/b/a/y/z/g/h;->b:Le/b/a/y/q;

    invoke-virtual {p0, p1}, Le/b/a/c0/a;->a(Le/b/a/y/q;)Le/b/a/c0/a;

    move-result-object p1

    return-object p1
.end method

.method public a(Le/b/a/c0/a;)Le/b/a/c0/a;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/c0/a<",
            "*>;)TT;"
        }
    .end annotation

    .line 81
    iget-boolean v0, p0, Le/b/a/c0/a;->w:Z

    if-eqz v0, :cond_0

    .line 82
    invoke-virtual {p0}, Le/b/a/c0/a;->clone()Le/b/a/c0/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/b/a/c0/a;->a(Le/b/a/c0/a;)Le/b/a/c0/a;

    move-result-object p1

    return-object p1

    .line 83
    :cond_0
    iget v0, p1, Le/b/a/c0/a;->b:I

    const/4 v1, 0x2

    invoke-static {v0, v1}, Le/b/a/c0/a;->b(II)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 84
    iget v0, p1, Le/b/a/c0/a;->c:F

    iput v0, p0, Le/b/a/c0/a;->c:F

    .line 85
    :cond_1
    iget v0, p1, Le/b/a/c0/a;->b:I

    const/high16 v1, 0x40000

    invoke-static {v0, v1}, Le/b/a/c0/a;->b(II)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 86
    iget-boolean v0, p1, Le/b/a/c0/a;->x:Z

    iput-boolean v0, p0, Le/b/a/c0/a;->x:Z

    .line 87
    :cond_2
    iget v0, p1, Le/b/a/c0/a;->b:I

    const/high16 v1, 0x100000

    invoke-static {v0, v1}, Le/b/a/c0/a;->b(II)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 88
    iget-boolean v0, p1, Le/b/a/c0/a;->A:Z

    iput-boolean v0, p0, Le/b/a/c0/a;->A:Z

    .line 89
    :cond_3
    iget v0, p1, Le/b/a/c0/a;->b:I

    const/4 v1, 0x4

    invoke-static {v0, v1}, Le/b/a/c0/a;->b(II)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 90
    iget-object v0, p1, Le/b/a/c0/a;->d:Le/b/a/y/x/c0;

    iput-object v0, p0, Le/b/a/c0/a;->d:Le/b/a/y/x/c0;

    .line 91
    :cond_4
    iget v0, p1, Le/b/a/c0/a;->b:I

    const/16 v1, 0x8

    invoke-static {v0, v1}, Le/b/a/c0/a;->b(II)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 92
    iget-object v0, p1, Le/b/a/c0/a;->e:Le/b/a/n;

    iput-object v0, p0, Le/b/a/c0/a;->e:Le/b/a/n;

    .line 93
    :cond_5
    iget v0, p1, Le/b/a/c0/a;->b:I

    const/16 v1, 0x10

    invoke-static {v0, v1}, Le/b/a/c0/a;->b(II)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    .line 94
    iget-object v0, p1, Le/b/a/c0/a;->f:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Le/b/a/c0/a;->f:Landroid/graphics/drawable/Drawable;

    .line 95
    iput v1, p0, Le/b/a/c0/a;->g:I

    .line 96
    iget v0, p0, Le/b/a/c0/a;->b:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Le/b/a/c0/a;->b:I

    .line 97
    :cond_6
    iget v0, p1, Le/b/a/c0/a;->b:I

    const/16 v2, 0x20

    invoke-static {v0, v2}, Le/b/a/c0/a;->b(II)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    .line 98
    iget v0, p1, Le/b/a/c0/a;->g:I

    iput v0, p0, Le/b/a/c0/a;->g:I

    .line 99
    iput-object v2, p0, Le/b/a/c0/a;->f:Landroid/graphics/drawable/Drawable;

    .line 100
    iget v0, p0, Le/b/a/c0/a;->b:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Le/b/a/c0/a;->b:I

    .line 101
    :cond_7
    iget v0, p1, Le/b/a/c0/a;->b:I

    const/16 v3, 0x40

    invoke-static {v0, v3}, Le/b/a/c0/a;->b(II)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 102
    iget-object v0, p1, Le/b/a/c0/a;->h:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Le/b/a/c0/a;->h:Landroid/graphics/drawable/Drawable;

    .line 103
    iput v1, p0, Le/b/a/c0/a;->i:I

    .line 104
    iget v0, p0, Le/b/a/c0/a;->b:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Le/b/a/c0/a;->b:I

    .line 105
    :cond_8
    iget v0, p1, Le/b/a/c0/a;->b:I

    const/16 v3, 0x80

    invoke-static {v0, v3}, Le/b/a/c0/a;->b(II)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 106
    iget v0, p1, Le/b/a/c0/a;->i:I

    iput v0, p0, Le/b/a/c0/a;->i:I

    .line 107
    iput-object v2, p0, Le/b/a/c0/a;->h:Landroid/graphics/drawable/Drawable;

    .line 108
    iget v0, p0, Le/b/a/c0/a;->b:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Le/b/a/c0/a;->b:I

    .line 109
    :cond_9
    iget v0, p1, Le/b/a/c0/a;->b:I

    const/16 v3, 0x100

    invoke-static {v0, v3}, Le/b/a/c0/a;->b(II)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 110
    iget-boolean v0, p1, Le/b/a/c0/a;->j:Z

    iput-boolean v0, p0, Le/b/a/c0/a;->j:Z

    .line 111
    :cond_a
    iget v0, p1, Le/b/a/c0/a;->b:I

    const/16 v3, 0x200

    invoke-static {v0, v3}, Le/b/a/c0/a;->b(II)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 112
    iget v0, p1, Le/b/a/c0/a;->l:I

    iput v0, p0, Le/b/a/c0/a;->l:I

    .line 113
    iget v0, p1, Le/b/a/c0/a;->k:I

    iput v0, p0, Le/b/a/c0/a;->k:I

    .line 114
    :cond_b
    iget v0, p1, Le/b/a/c0/a;->b:I

    const/16 v3, 0x400

    invoke-static {v0, v3}, Le/b/a/c0/a;->b(II)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 115
    iget-object v0, p1, Le/b/a/c0/a;->m:Le/b/a/y/n;

    iput-object v0, p0, Le/b/a/c0/a;->m:Le/b/a/y/n;

    .line 116
    :cond_c
    iget v0, p1, Le/b/a/c0/a;->b:I

    const/16 v3, 0x1000

    invoke-static {v0, v3}, Le/b/a/c0/a;->b(II)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 117
    iget-object v0, p1, Le/b/a/c0/a;->t:Ljava/lang/Class;

    iput-object v0, p0, Le/b/a/c0/a;->t:Ljava/lang/Class;

    .line 118
    :cond_d
    iget v0, p1, Le/b/a/c0/a;->b:I

    const/16 v3, 0x2000

    invoke-static {v0, v3}, Le/b/a/c0/a;->b(II)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 119
    iget-object v0, p1, Le/b/a/c0/a;->p:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Le/b/a/c0/a;->p:Landroid/graphics/drawable/Drawable;

    .line 120
    iput v1, p0, Le/b/a/c0/a;->q:I

    .line 121
    iget v0, p0, Le/b/a/c0/a;->b:I

    and-int/lit16 v0, v0, -0x4001

    iput v0, p0, Le/b/a/c0/a;->b:I

    .line 122
    :cond_e
    iget v0, p1, Le/b/a/c0/a;->b:I

    const/16 v3, 0x4000

    invoke-static {v0, v3}, Le/b/a/c0/a;->b(II)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 123
    iget v0, p1, Le/b/a/c0/a;->q:I

    iput v0, p0, Le/b/a/c0/a;->q:I

    .line 124
    iput-object v2, p0, Le/b/a/c0/a;->p:Landroid/graphics/drawable/Drawable;

    .line 125
    iget v0, p0, Le/b/a/c0/a;->b:I

    and-int/lit16 v0, v0, -0x2001

    iput v0, p0, Le/b/a/c0/a;->b:I

    .line 126
    :cond_f
    iget v0, p1, Le/b/a/c0/a;->b:I

    const v2, 0x8000

    invoke-static {v0, v2}, Le/b/a/c0/a;->b(II)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 127
    iget-object v0, p1, Le/b/a/c0/a;->v:Landroid/content/res/Resources$Theme;

    iput-object v0, p0, Le/b/a/c0/a;->v:Landroid/content/res/Resources$Theme;

    .line 128
    :cond_10
    iget v0, p1, Le/b/a/c0/a;->b:I

    const/high16 v2, 0x10000

    invoke-static {v0, v2}, Le/b/a/c0/a;->b(II)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 129
    iget-boolean v0, p1, Le/b/a/c0/a;->o:Z

    iput-boolean v0, p0, Le/b/a/c0/a;->o:Z

    .line 130
    :cond_11
    iget v0, p1, Le/b/a/c0/a;->b:I

    const/high16 v2, 0x20000

    invoke-static {v0, v2}, Le/b/a/c0/a;->b(II)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 131
    iget-boolean v0, p1, Le/b/a/c0/a;->n:Z

    iput-boolean v0, p0, Le/b/a/c0/a;->n:Z

    .line 132
    :cond_12
    iget v0, p1, Le/b/a/c0/a;->b:I

    const/16 v2, 0x800

    invoke-static {v0, v2}, Le/b/a/c0/a;->b(II)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 133
    iget-object v0, p0, Le/b/a/c0/a;->s:Ljava/util/Map;

    iget-object v2, p1, Le/b/a/c0/a;->s:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 134
    iget-boolean v0, p1, Le/b/a/c0/a;->z:Z

    iput-boolean v0, p0, Le/b/a/c0/a;->z:Z

    .line 135
    :cond_13
    iget v0, p1, Le/b/a/c0/a;->b:I

    const/high16 v2, 0x80000

    invoke-static {v0, v2}, Le/b/a/c0/a;->b(II)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 136
    iget-boolean v0, p1, Le/b/a/c0/a;->y:Z

    iput-boolean v0, p0, Le/b/a/c0/a;->y:Z

    .line 137
    :cond_14
    iget-boolean v0, p0, Le/b/a/c0/a;->o:Z

    if-nez v0, :cond_15

    .line 138
    iget-object v0, p0, Le/b/a/c0/a;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 139
    iget v0, p0, Le/b/a/c0/a;->b:I

    and-int/lit16 v0, v0, -0x801

    iput v0, p0, Le/b/a/c0/a;->b:I

    .line 140
    iput-boolean v1, p0, Le/b/a/c0/a;->n:Z

    const v1, -0x20001

    and-int/2addr v0, v1

    .line 141
    iput v0, p0, Le/b/a/c0/a;->b:I

    const/4 v0, 0x1

    .line 142
    iput-boolean v0, p0, Le/b/a/c0/a;->z:Z

    .line 143
    :cond_15
    iget v0, p0, Le/b/a/c0/a;->b:I

    iget v1, p1, Le/b/a/c0/a;->b:I

    or-int/2addr v0, v1

    iput v0, p0, Le/b/a/c0/a;->b:I

    .line 144
    iget-object v0, p0, Le/b/a/c0/a;->r:Le/b/a/y/r;

    iget-object p1, p1, Le/b/a/c0/a;->r:Le/b/a/y/r;

    invoke-virtual {v0, p1}, Le/b/a/y/r;->a(Le/b/a/y/r;)V

    .line 145
    invoke-virtual {p0}, Le/b/a/c0/a;->J()Le/b/a/c0/a;

    return-object p0
.end method

.method public a(Le/b/a/n;)Le/b/a/c0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/n;",
            ")TT;"
        }
    .end annotation

    .line 12
    iget-boolean v0, p0, Le/b/a/c0/a;->w:Z

    if-eqz v0, :cond_0

    .line 13
    invoke-virtual {p0}, Le/b/a/c0/a;->clone()Le/b/a/c0/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/b/a/c0/a;->a(Le/b/a/n;)Le/b/a/c0/a;

    move-result-object p1

    return-object p1

    .line 14
    :cond_0
    invoke-static {p1}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Le/b/a/n;

    iput-object p1, p0, Le/b/a/c0/a;->e:Le/b/a/n;

    .line 15
    iget p1, p0, Le/b/a/c0/a;->b:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, Le/b/a/c0/a;->b:I

    .line 16
    invoke-virtual {p0}, Le/b/a/c0/a;->J()Le/b/a/c0/a;

    return-object p0
.end method

.method public a(Le/b/a/y/n;)Le/b/a/c0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/n;",
            ")TT;"
        }
    .end annotation

    .line 35
    iget-boolean v0, p0, Le/b/a/c0/a;->w:Z

    if-eqz v0, :cond_0

    .line 36
    invoke-virtual {p0}, Le/b/a/c0/a;->clone()Le/b/a/c0/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/b/a/c0/a;->a(Le/b/a/y/n;)Le/b/a/c0/a;

    move-result-object p1

    return-object p1

    .line 37
    :cond_0
    invoke-static {p1}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Le/b/a/y/n;

    iput-object p1, p0, Le/b/a/c0/a;->m:Le/b/a/y/n;

    .line 38
    iget p1, p0, Le/b/a/c0/a;->b:I

    or-int/lit16 p1, p1, 0x400

    iput p1, p0, Le/b/a/c0/a;->b:I

    .line 39
    invoke-virtual {p0}, Le/b/a/c0/a;->J()Le/b/a/c0/a;

    return-object p0
.end method

.method public a(Le/b/a/y/q;)Le/b/a/c0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/q<",
            "*>;)TT;"
        }
    .end annotation

    .line 46
    iget-boolean v0, p0, Le/b/a/c0/a;->w:Z

    if-eqz v0, :cond_0

    .line 47
    invoke-virtual {p0}, Le/b/a/c0/a;->clone()Le/b/a/c0/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/b/a/c0/a;->a(Le/b/a/y/q;)Le/b/a/c0/a;

    move-result-object p1

    return-object p1

    .line 48
    :cond_0
    iget-object v0, p0, Le/b/a/c0/a;->r:Le/b/a/y/r;

    invoke-virtual {v0, p1}, Le/b/a/y/r;->b(Le/b/a/y/q;)Le/b/a/y/r;

    .line 49
    invoke-virtual {p0}, Le/b/a/c0/a;->J()Le/b/a/c0/a;

    return-object p0
.end method

.method public a(Le/b/a/y/q;Ljava/lang/Object;)Le/b/a/c0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y:",
            "Ljava/lang/Object;",
            ">(",
            "Le/b/a/y/q<",
            "TY;>;TY;)TT;"
        }
    .end annotation

    .line 40
    iget-boolean v0, p0, Le/b/a/c0/a;->w:Z

    if-eqz v0, :cond_0

    .line 41
    invoke-virtual {p0}, Le/b/a/c0/a;->clone()Le/b/a/c0/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Le/b/a/c0/a;->a(Le/b/a/y/q;Ljava/lang/Object;)Le/b/a/c0/a;

    move-result-object p1

    return-object p1

    .line 42
    :cond_0
    invoke-static {p1}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    invoke-static {p2}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    iget-object v0, p0, Le/b/a/c0/a;->r:Le/b/a/y/r;

    invoke-virtual {v0, p1, p2}, Le/b/a/y/r;->a(Le/b/a/y/q;Ljava/lang/Object;)Le/b/a/y/r;

    .line 45
    invoke-virtual {p0}, Le/b/a/c0/a;->J()Le/b/a/c0/a;

    return-object p0
.end method

.method public a(Le/b/a/y/v;)Le/b/a/c0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/v<",
            "Landroid/graphics/Bitmap;",
            ">;)TT;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 60
    invoke-virtual {p0, p1, v0}, Le/b/a/c0/a;->a(Le/b/a/y/v;Z)Le/b/a/c0/a;

    move-result-object p1

    return-object p1
.end method

.method public a(Le/b/a/y/v;Z)Le/b/a/c0/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/v<",
            "Landroid/graphics/Bitmap;",
            ">;Z)TT;"
        }
    .end annotation

    .line 61
    iget-boolean v0, p0, Le/b/a/c0/a;->w:Z

    if-eqz v0, :cond_0

    .line 62
    invoke-virtual {p0}, Le/b/a/c0/a;->clone()Le/b/a/c0/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Le/b/a/c0/a;->a(Le/b/a/y/v;Z)Le/b/a/c0/a;

    move-result-object p1

    return-object p1

    .line 63
    :cond_0
    new-instance v0, Le/b/a/y/z/e/a0;

    invoke-direct {v0, p1, p2}, Le/b/a/y/z/e/a0;-><init>(Le/b/a/y/v;Z)V

    .line 64
    const-class v1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, v1, p1, p2}, Le/b/a/c0/a;->a(Ljava/lang/Class;Le/b/a/y/v;Z)Le/b/a/c0/a;

    .line 65
    const-class v1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v1, v0, p2}, Le/b/a/c0/a;->a(Ljava/lang/Class;Le/b/a/y/v;Z)Le/b/a/c0/a;

    .line 66
    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Le/b/a/y/z/e/a0;->a()Le/b/a/y/v;

    invoke-virtual {p0, v1, v0, p2}, Le/b/a/c0/a;->a(Ljava/lang/Class;Le/b/a/y/v;Z)Le/b/a/c0/a;

    .line 67
    const-class v0, Le/b/a/y/z/i/f;

    new-instance v1, Le/b/a/y/z/i/i;

    invoke-direct {v1, p1}, Le/b/a/y/z/i/i;-><init>(Le/b/a/y/v;)V

    invoke-virtual {p0, v0, v1, p2}, Le/b/a/c0/a;->a(Ljava/lang/Class;Le/b/a/y/v;Z)Le/b/a/c0/a;

    .line 68
    invoke-virtual {p0}, Le/b/a/c0/a;->J()Le/b/a/c0/a;

    return-object p0
.end method

.method public a(Le/b/a/y/x/c0;)Le/b/a/c0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/c0;",
            ")TT;"
        }
    .end annotation

    .line 7
    iget-boolean v0, p0, Le/b/a/c0/a;->w:Z

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {p0}, Le/b/a/c0/a;->clone()Le/b/a/c0/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/b/a/c0/a;->a(Le/b/a/y/x/c0;)Le/b/a/c0/a;

    move-result-object p1

    return-object p1

    .line 9
    :cond_0
    invoke-static {p1}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Le/b/a/y/x/c0;

    iput-object p1, p0, Le/b/a/c0/a;->d:Le/b/a/y/x/c0;

    .line 10
    iget p1, p0, Le/b/a/c0/a;->b:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Le/b/a/c0/a;->b:I

    .line 11
    invoke-virtual {p0}, Le/b/a/c0/a;->J()Le/b/a/c0/a;

    return-object p0
.end method

.method public a(Le/b/a/y/z/e/u;)Le/b/a/c0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/z/e/u;",
            ")TT;"
        }
    .end annotation

    .line 55
    sget-object v0, Le/b/a/y/z/e/u;->f:Le/b/a/y/q;

    invoke-static {p1}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0, p1}, Le/b/a/c0/a;->a(Le/b/a/y/q;Ljava/lang/Object;)Le/b/a/c0/a;

    move-result-object p1

    return-object p1
.end method

.method public final a(Le/b/a/y/z/e/u;Le/b/a/y/v;)Le/b/a/c0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/z/e/u;",
            "Le/b/a/y/v<",
            "Landroid/graphics/Bitmap;",
            ">;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 56
    invoke-virtual {p0, p1, p2, v0}, Le/b/a/c0/a;->a(Le/b/a/y/z/e/u;Le/b/a/y/v;Z)Le/b/a/c0/a;

    move-result-object p1

    return-object p1
.end method

.method public final a(Le/b/a/y/z/e/u;Le/b/a/y/v;Z)Le/b/a/c0/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/z/e/u;",
            "Le/b/a/y/v<",
            "Landroid/graphics/Bitmap;",
            ">;Z)TT;"
        }
    .end annotation

    if-eqz p3, :cond_0

    .line 57
    invoke-virtual {p0, p1, p2}, Le/b/a/c0/a;->d(Le/b/a/y/z/e/u;Le/b/a/y/v;)Le/b/a/c0/a;

    move-result-object p1

    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {p0, p1, p2}, Le/b/a/c0/a;->b(Le/b/a/y/z/e/u;Le/b/a/y/v;)Le/b/a/c0/a;

    move-result-object p1

    :goto_0
    const/4 p2, 0x1

    .line 59
    iput-boolean p2, p1, Le/b/a/c0/a;->z:Z

    return-object p1
.end method

.method public a(Ljava/lang/Class;)Le/b/a/c0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)TT;"
        }
    .end annotation

    .line 50
    iget-boolean v0, p0, Le/b/a/c0/a;->w:Z

    if-eqz v0, :cond_0

    .line 51
    invoke-virtual {p0}, Le/b/a/c0/a;->clone()Le/b/a/c0/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/b/a/c0/a;->a(Ljava/lang/Class;)Le/b/a/c0/a;

    move-result-object p1

    return-object p1

    .line 52
    :cond_0
    invoke-static {p1}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/Class;

    iput-object p1, p0, Le/b/a/c0/a;->t:Ljava/lang/Class;

    .line 53
    iget p1, p0, Le/b/a/c0/a;->b:I

    or-int/lit16 p1, p1, 0x1000

    iput p1, p0, Le/b/a/c0/a;->b:I

    .line 54
    invoke-virtual {p0}, Le/b/a/c0/a;->J()Le/b/a/c0/a;

    return-object p0
.end method

.method public a(Ljava/lang/Class;Le/b/a/y/v;Z)Le/b/a/c0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TY;>;",
            "Le/b/a/y/v<",
            "TY;>;Z)TT;"
        }
    .end annotation

    .line 69
    iget-boolean v0, p0, Le/b/a/c0/a;->w:Z

    if-eqz v0, :cond_0

    .line 70
    invoke-virtual {p0}, Le/b/a/c0/a;->clone()Le/b/a/c0/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Le/b/a/c0/a;->a(Ljava/lang/Class;Le/b/a/y/v;Z)Le/b/a/c0/a;

    move-result-object p1

    return-object p1

    .line 71
    :cond_0
    invoke-static {p1}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    invoke-static {p2}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    iget-object v0, p0, Le/b/a/c0/a;->s:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    iget p1, p0, Le/b/a/c0/a;->b:I

    or-int/lit16 p1, p1, 0x800

    iput p1, p0, Le/b/a/c0/a;->b:I

    const/4 p2, 0x1

    .line 75
    iput-boolean p2, p0, Le/b/a/c0/a;->o:Z

    const/high16 v0, 0x10000

    or-int/2addr p1, v0

    .line 76
    iput p1, p0, Le/b/a/c0/a;->b:I

    const/4 v0, 0x0

    .line 77
    iput-boolean v0, p0, Le/b/a/c0/a;->z:Z

    if-eqz p3, :cond_1

    const/high16 p3, 0x20000

    or-int/2addr p1, p3

    .line 78
    iput p1, p0, Le/b/a/c0/a;->b:I

    .line 79
    iput-boolean p2, p0, Le/b/a/c0/a;->n:Z

    .line 80
    :cond_1
    invoke-virtual {p0}, Le/b/a/c0/a;->J()Le/b/a/c0/a;

    return-object p0
.end method

.method public a(Z)Le/b/a/c0/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TT;"
        }
    .end annotation

    .line 24
    iget-boolean v0, p0, Le/b/a/c0/a;->w:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 25
    invoke-virtual {p0}, Le/b/a/c0/a;->clone()Le/b/a/c0/a;

    move-result-object p1

    invoke-virtual {p1, v1}, Le/b/a/c0/a;->a(Z)Le/b/a/c0/a;

    move-result-object p1

    return-object p1

    :cond_0
    xor-int/2addr p1, v1

    .line 26
    iput-boolean p1, p0, Le/b/a/c0/a;->j:Z

    .line 27
    iget p1, p0, Le/b/a/c0/a;->b:I

    or-int/lit16 p1, p1, 0x100

    iput p1, p0, Le/b/a/c0/a;->b:I

    .line 28
    invoke-virtual {p0}, Le/b/a/c0/a;->J()Le/b/a/c0/a;

    return-object p0
.end method

.method public final a(I)Z
    .locals 1

    .line 150
    iget v0, p0, Le/b/a/c0/a;->b:I

    invoke-static {v0, p1}, Le/b/a/c0/a;->b(II)Z

    move-result p1

    return p1
.end method

.method public b()Le/b/a/c0/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 13
    sget-object v0, Le/b/a/y/z/e/u;->a:Le/b/a/y/z/e/u;

    new-instance v1, Le/b/a/y/z/e/c0;

    invoke-direct {v1}, Le/b/a/y/z/e/c0;-><init>()V

    invoke-virtual {p0, v0, v1}, Le/b/a/c0/a;->c(Le/b/a/y/z/e/u;Le/b/a/y/v;)Le/b/a/c0/a;

    move-result-object v0

    return-object v0
.end method

.method public b(I)Le/b/a/c0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 6
    iget-boolean v0, p0, Le/b/a/c0/a;->w:Z

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {p0}, Le/b/a/c0/a;->clone()Le/b/a/c0/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/b/a/c0/a;->b(I)Le/b/a/c0/a;

    move-result-object p1

    return-object p1

    .line 8
    :cond_0
    iput p1, p0, Le/b/a/c0/a;->i:I

    .line 9
    iget p1, p0, Le/b/a/c0/a;->b:I

    or-int/lit16 p1, p1, 0x80

    iput p1, p0, Le/b/a/c0/a;->b:I

    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Le/b/a/c0/a;->h:Landroid/graphics/drawable/Drawable;

    and-int/lit8 p1, p1, -0x41

    .line 11
    iput p1, p0, Le/b/a/c0/a;->b:I

    .line 12
    invoke-virtual {p0}, Le/b/a/c0/a;->J()Le/b/a/c0/a;

    return-object p0
.end method

.method public final b(Le/b/a/y/z/e/u;Le/b/a/y/v;)Le/b/a/c0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/z/e/u;",
            "Le/b/a/y/v<",
            "Landroid/graphics/Bitmap;",
            ">;)TT;"
        }
    .end annotation

    .line 14
    iget-boolean v0, p0, Le/b/a/c0/a;->w:Z

    if-eqz v0, :cond_0

    .line 15
    invoke-virtual {p0}, Le/b/a/c0/a;->clone()Le/b/a/c0/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Le/b/a/c0/a;->b(Le/b/a/y/z/e/u;Le/b/a/y/v;)Le/b/a/c0/a;

    move-result-object p1

    return-object p1

    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Le/b/a/c0/a;->a(Le/b/a/y/z/e/u;)Le/b/a/c0/a;

    const/4 p1, 0x0

    .line 17
    invoke-virtual {p0, p2, p1}, Le/b/a/c0/a;->a(Le/b/a/y/v;Z)Le/b/a/c0/a;

    move-result-object p1

    return-object p1
.end method

.method public b(Z)Le/b/a/c0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TT;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Le/b/a/c0/a;->w:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Le/b/a/c0/a;->clone()Le/b/a/c0/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/b/a/c0/a;->b(Z)Le/b/a/c0/a;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    iput-boolean p1, p0, Le/b/a/c0/a;->A:Z

    .line 4
    iget p1, p0, Le/b/a/c0/a;->b:I

    const/high16 v0, 0x100000

    or-int/2addr p1, v0

    iput p1, p0, Le/b/a/c0/a;->b:I

    .line 5
    invoke-virtual {p0}, Le/b/a/c0/a;->J()Le/b/a/c0/a;

    return-object p0
.end method

.method public final c(Le/b/a/y/z/e/u;Le/b/a/y/v;)Le/b/a/c0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/z/e/u;",
            "Le/b/a/y/v<",
            "Landroid/graphics/Bitmap;",
            ">;)TT;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Le/b/a/c0/a;->a(Le/b/a/y/z/e/u;Le/b/a/y/v;Z)Le/b/a/c0/a;

    move-result-object p1

    return-object p1
.end method

.method public clone()Le/b/a/c0/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 2
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/c0/a;

    .line 3
    new-instance v1, Le/b/a/y/r;

    invoke-direct {v1}, Le/b/a/y/r;-><init>()V

    iput-object v1, v0, Le/b/a/c0/a;->r:Le/b/a/y/r;

    .line 4
    iget-object v2, p0, Le/b/a/c0/a;->r:Le/b/a/y/r;

    invoke-virtual {v1, v2}, Le/b/a/y/r;->a(Le/b/a/y/r;)V

    .line 5
    new-instance v1, Le/b/a/e0/d;

    invoke-direct {v1}, Le/b/a/e0/d;-><init>()V

    iput-object v1, v0, Le/b/a/c0/a;->s:Ljava/util/Map;

    .line 6
    iget-object v2, p0, Le/b/a/c0/a;->s:Ljava/util/Map;

    invoke-interface {v1, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    const/4 v1, 0x0

    .line 7
    iput-boolean v1, v0, Le/b/a/c0/a;->u:Z

    .line 8
    iput-boolean v1, v0, Le/b/a/c0/a;->w:Z
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 9
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/b/a/c0/a;->clone()Le/b/a/c0/a;

    move-result-object v0

    return-object v0
.end method

.method public final d(Le/b/a/y/z/e/u;Le/b/a/y/v;)Le/b/a/c0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/z/e/u;",
            "Le/b/a/y/v<",
            "Landroid/graphics/Bitmap;",
            ">;)TT;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Le/b/a/c0/a;->w:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Le/b/a/c0/a;->clone()Le/b/a/c0/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Le/b/a/c0/a;->d(Le/b/a/y/z/e/u;Le/b/a/y/v;)Le/b/a/c0/a;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Le/b/a/c0/a;->a(Le/b/a/y/z/e/u;)Le/b/a/c0/a;

    .line 4
    invoke-virtual {p0, p2}, Le/b/a/c0/a;->a(Le/b/a/y/v;)Le/b/a/c0/a;

    move-result-object p1

    return-object p1
.end method

.method public final d()Le/b/a/y/x/c0;
    .locals 1

    .line 5
    iget-object v0, p0, Le/b/a/c0/a;->d:Le/b/a/y/x/c0;

    return-object v0
.end method

.method public final e()I
    .locals 1

    .line 1
    iget v0, p0, Le/b/a/c0/a;->g:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Le/b/a/c0/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Le/b/a/c0/a;

    .line 3
    iget v0, p1, Le/b/a/c0/a;->c:F

    iget v2, p0, Le/b/a/c0/a;->c:F

    invoke-static {v0, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Le/b/a/c0/a;->g:I

    iget v2, p1, Le/b/a/c0/a;->g:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Le/b/a/c0/a;->f:Landroid/graphics/drawable/Drawable;

    iget-object v2, p1, Le/b/a/c0/a;->f:Landroid/graphics/drawable/Drawable;

    .line 4
    invoke-static {v0, v2}, Le/b/a/e0/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Le/b/a/c0/a;->i:I

    iget v2, p1, Le/b/a/c0/a;->i:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Le/b/a/c0/a;->h:Landroid/graphics/drawable/Drawable;

    iget-object v2, p1, Le/b/a/c0/a;->h:Landroid/graphics/drawable/Drawable;

    .line 5
    invoke-static {v0, v2}, Le/b/a/e0/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Le/b/a/c0/a;->q:I

    iget v2, p1, Le/b/a/c0/a;->q:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Le/b/a/c0/a;->p:Landroid/graphics/drawable/Drawable;

    iget-object v2, p1, Le/b/a/c0/a;->p:Landroid/graphics/drawable/Drawable;

    .line 6
    invoke-static {v0, v2}, Le/b/a/e0/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Le/b/a/c0/a;->j:Z

    iget-boolean v2, p1, Le/b/a/c0/a;->j:Z

    if-ne v0, v2, :cond_0

    iget v0, p0, Le/b/a/c0/a;->k:I

    iget v2, p1, Le/b/a/c0/a;->k:I

    if-ne v0, v2, :cond_0

    iget v0, p0, Le/b/a/c0/a;->l:I

    iget v2, p1, Le/b/a/c0/a;->l:I

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Le/b/a/c0/a;->n:Z

    iget-boolean v2, p1, Le/b/a/c0/a;->n:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Le/b/a/c0/a;->o:Z

    iget-boolean v2, p1, Le/b/a/c0/a;->o:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Le/b/a/c0/a;->x:Z

    iget-boolean v2, p1, Le/b/a/c0/a;->x:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Le/b/a/c0/a;->y:Z

    iget-boolean v2, p1, Le/b/a/c0/a;->y:Z

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Le/b/a/c0/a;->d:Le/b/a/y/x/c0;

    iget-object v2, p1, Le/b/a/c0/a;->d:Le/b/a/y/x/c0;

    .line 7
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/b/a/c0/a;->e:Le/b/a/n;

    iget-object v2, p1, Le/b/a/c0/a;->e:Le/b/a/n;

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Le/b/a/c0/a;->r:Le/b/a/y/r;

    iget-object v2, p1, Le/b/a/c0/a;->r:Le/b/a/y/r;

    .line 8
    invoke-virtual {v0, v2}, Le/b/a/y/r;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/b/a/c0/a;->s:Ljava/util/Map;

    iget-object v2, p1, Le/b/a/c0/a;->s:Ljava/util/Map;

    .line 9
    invoke-interface {v0, v2}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/b/a/c0/a;->t:Ljava/lang/Class;

    iget-object v2, p1, Le/b/a/c0/a;->t:Ljava/lang/Class;

    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/b/a/c0/a;->m:Le/b/a/y/n;

    iget-object v2, p1, Le/b/a/c0/a;->m:Le/b/a/y/n;

    .line 11
    invoke-static {v0, v2}, Le/b/a/e0/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/b/a/c0/a;->v:Landroid/content/res/Resources$Theme;

    iget-object p1, p1, Le/b/a/c0/a;->v:Landroid/content/res/Resources$Theme;

    .line 12
    invoke-static {v0, p1}, Le/b/a/e0/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final f()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/a;->f:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final g()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/a;->p:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, Le/b/a/c0/a;->q:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Le/b/a/c0/a;->c:F

    invoke-static {v0}, Le/b/a/e0/t;->a(F)I

    move-result v0

    .line 2
    iget v1, p0, Le/b/a/c0/a;->g:I

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(II)I

    move-result v0

    .line 3
    iget-object v1, p0, Le/b/a/c0/a;->f:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(Ljava/lang/Object;I)I

    move-result v0

    .line 4
    iget v1, p0, Le/b/a/c0/a;->i:I

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(II)I

    move-result v0

    .line 5
    iget-object v1, p0, Le/b/a/c0/a;->h:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(Ljava/lang/Object;I)I

    move-result v0

    .line 6
    iget v1, p0, Le/b/a/c0/a;->q:I

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(II)I

    move-result v0

    .line 7
    iget-object v1, p0, Le/b/a/c0/a;->p:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(Ljava/lang/Object;I)I

    move-result v0

    .line 8
    iget-boolean v1, p0, Le/b/a/c0/a;->j:Z

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(ZI)I

    move-result v0

    .line 9
    iget v1, p0, Le/b/a/c0/a;->k:I

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(II)I

    move-result v0

    .line 10
    iget v1, p0, Le/b/a/c0/a;->l:I

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(II)I

    move-result v0

    .line 11
    iget-boolean v1, p0, Le/b/a/c0/a;->n:Z

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(ZI)I

    move-result v0

    .line 12
    iget-boolean v1, p0, Le/b/a/c0/a;->o:Z

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(ZI)I

    move-result v0

    .line 13
    iget-boolean v1, p0, Le/b/a/c0/a;->x:Z

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(ZI)I

    move-result v0

    .line 14
    iget-boolean v1, p0, Le/b/a/c0/a;->y:Z

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(ZI)I

    move-result v0

    .line 15
    iget-object v1, p0, Le/b/a/c0/a;->d:Le/b/a/y/x/c0;

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(Ljava/lang/Object;I)I

    move-result v0

    .line 16
    iget-object v1, p0, Le/b/a/c0/a;->e:Le/b/a/n;

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(Ljava/lang/Object;I)I

    move-result v0

    .line 17
    iget-object v1, p0, Le/b/a/c0/a;->r:Le/b/a/y/r;

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(Ljava/lang/Object;I)I

    move-result v0

    .line 18
    iget-object v1, p0, Le/b/a/c0/a;->s:Ljava/util/Map;

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(Ljava/lang/Object;I)I

    move-result v0

    .line 19
    iget-object v1, p0, Le/b/a/c0/a;->t:Ljava/lang/Class;

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(Ljava/lang/Object;I)I

    move-result v0

    .line 20
    iget-object v1, p0, Le/b/a/c0/a;->m:Le/b/a/y/n;

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(Ljava/lang/Object;I)I

    move-result v0

    .line 21
    iget-object v1, p0, Le/b/a/c0/a;->v:Landroid/content/res/Resources$Theme;

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(Ljava/lang/Object;I)I

    move-result v0

    return v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/b/a/c0/a;->y:Z

    return v0
.end method

.method public final j()Le/b/a/y/r;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/a;->r:Le/b/a/y/r;

    return-object v0
.end method

.method public final k()I
    .locals 1

    .line 1
    iget v0, p0, Le/b/a/c0/a;->k:I

    return v0
.end method

.method public final l()I
    .locals 1

    .line 1
    iget v0, p0, Le/b/a/c0/a;->l:I

    return v0
.end method

.method public final m()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/a;->h:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final n()I
    .locals 1

    .line 1
    iget v0, p0, Le/b/a/c0/a;->i:I

    return v0
.end method

.method public final o()Le/b/a/n;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/a;->e:Le/b/a/n;

    return-object v0
.end method

.method public final p()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/c0/a;->t:Ljava/lang/Class;

    return-object v0
.end method

.method public final q()Le/b/a/y/n;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/a;->m:Le/b/a/y/n;

    return-object v0
.end method

.method public final r()F
    .locals 1

    .line 1
    iget v0, p0, Le/b/a/c0/a;->c:F

    return v0
.end method

.method public final s()Landroid/content/res/Resources$Theme;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/a;->v:Landroid/content/res/Resources$Theme;

    return-object v0
.end method

.method public final t()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Le/b/a/y/v<",
            "*>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/c0/a;->s:Ljava/util/Map;

    return-object v0
.end method

.method public final u()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/b/a/c0/a;->A:Z

    return v0
.end method

.method public final v()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/b/a/c0/a;->x:Z

    return v0
.end method

.method public final w()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/b/a/c0/a;->w:Z

    return v0
.end method

.method public final x()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/b/a/c0/a;->j:Z

    return v0
.end method

.method public final y()Z
    .locals 1

    const/16 v0, 0x8

    .line 1
    invoke-virtual {p0, v0}, Le/b/a/c0/a;->a(I)Z

    move-result v0

    return v0
.end method

.method public z()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/b/a/c0/a;->z:Z

    return v0
.end method
