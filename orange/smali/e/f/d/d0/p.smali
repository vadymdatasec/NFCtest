.class public final Le/f/d/d0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/d/b0;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final h:Le/f/d/d0/p;


# instance fields
.field public b:D

.field public c:I

.field public d:Z

.field public e:Z

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/f/d/a;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/f/d/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/d/d0/p;

    invoke-direct {v0}, Le/f/d/d0/p;-><init>()V

    sput-object v0, Le/f/d/d0/p;->h:Le/f/d/d0/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 2
    iput-wide v0, p0, Le/f/d/d0/p;->b:D

    const/16 v0, 0x88

    .line 3
    iput v0, p0, Le/f/d/d0/p;->c:I

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Le/f/d/d0/p;->d:Z

    .line 5
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Le/f/d/d0/p;->f:Ljava/util/List;

    .line 6
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Le/f/d/d0/p;->g:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Le/f/d/q;Le/f/d/e0/a;)Le/f/d/a0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/d/q;",
            "Le/f/d/e0/a<",
            "TT;>;)",
            "Le/f/d/a0<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Le/f/d/e0/a;->a()Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x1

    .line 2
    invoke-virtual {p0, v0, v1}, Le/f/d/d0/p;->a(Ljava/lang/Class;Z)Z

    move-result v5

    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v0, v1}, Le/f/d/d0/p;->a(Ljava/lang/Class;Z)Z

    move-result v4

    if-nez v5, :cond_0

    if-nez v4, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 4
    :cond_0
    new-instance v0, Le/f/d/d0/o;

    move-object v2, v0

    move-object v3, p0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v2 .. v7}, Le/f/d/d0/o;-><init>(Le/f/d/d0/p;ZZLe/f/d/q;Le/f/d/e0/a;)V

    return-object v0
.end method

.method public final a(Le/f/d/c0/c;)Z
    .locals 4

    if-eqz p1, :cond_0

    .line 26
    invoke-interface {p1}, Le/f/d/c0/c;->value()D

    move-result-wide v0

    .line 27
    iget-wide v2, p0, Le/f/d/d0/p;->b:D

    cmpl-double p1, v0, v2

    if-lez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final a(Le/f/d/c0/c;Le/f/d/c0/d;)Z
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Le/f/d/d0/p;->a(Le/f/d/c0/c;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Le/f/d/d0/p;->a(Le/f/d/c0/d;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final a(Le/f/d/c0/d;)Z
    .locals 4

    if-eqz p1, :cond_0

    .line 28
    invoke-interface {p1}, Le/f/d/c0/d;->value()D

    move-result-wide v0

    .line 29
    iget-wide v2, p0, Le/f/d/d0/p;->b:D

    cmpg-double p1, v0, v2

    if-gtz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final a(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 24
    const-class v0, Ljava/lang/Enum;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Class;->isAnonymousClass()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Class;->isLocalClass()Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public a(Ljava/lang/Class;Z)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;Z)Z"
        }
    .end annotation

    .line 18
    iget-wide v0, p0, Le/f/d/d0/p;->b:D

    const/4 v2, 0x1

    const-wide/high16 v3, -0x4010000000000000L    # -1.0

    cmpl-double v5, v0, v3

    if-eqz v5, :cond_0

    const-class v0, Le/f/d/c0/c;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Le/f/d/c0/c;

    const-class v1, Le/f/d/c0/d;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    check-cast v1, Le/f/d/c0/d;

    invoke-virtual {p0, v0, v1}, Le/f/d/d0/p;->a(Le/f/d/c0/c;Le/f/d/c0/d;)Z

    move-result v0

    if-nez v0, :cond_0

    return v2

    .line 19
    :cond_0
    iget-boolean v0, p0, Le/f/d/d0/p;->d:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Le/f/d/d0/p;->b(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    .line 20
    :cond_1
    invoke-virtual {p0, p1}, Le/f/d/d0/p;->a(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v2

    :cond_2
    if-eqz p2, :cond_3

    .line 21
    iget-object p2, p0, Le/f/d/d0/p;->f:Ljava/util/List;

    goto :goto_0

    :cond_3
    iget-object p2, p0, Le/f/d/d0/p;->g:Ljava/util/List;

    .line 22
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/d/a;

    .line 23
    invoke-interface {v0, p1}, Le/f/d/a;->a(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_4

    return v2

    :cond_5
    const/4 p1, 0x0

    return p1
.end method

.method public a(Ljava/lang/reflect/Field;Z)Z
    .locals 6

    .line 5
    iget v0, p0, Le/f/d/d0/p;->c:I

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v1

    and-int/2addr v0, v1

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 6
    :cond_0
    iget-wide v2, p0, Le/f/d/d0/p;->b:D

    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    cmpl-double v0, v2, v4

    if-eqz v0, :cond_1

    const-class v0, Le/f/d/c0/c;

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Le/f/d/c0/c;

    const-class v2, Le/f/d/c0/d;

    invoke-virtual {p1, v2}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    check-cast v2, Le/f/d/c0/d;

    invoke-virtual {p0, v0, v2}, Le/f/d/d0/p;->a(Le/f/d/c0/c;Le/f/d/c0/d;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    .line 7
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->isSynthetic()Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    .line 8
    :cond_2
    iget-boolean v0, p0, Le/f/d/d0/p;->e:Z

    if-eqz v0, :cond_5

    .line 9
    const-class v0, Le/f/d/c0/a;

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Le/f/d/c0/a;

    if-eqz v0, :cond_4

    if-eqz p2, :cond_3

    .line 10
    invoke-interface {v0}, Le/f/d/c0/a;->serialize()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_3
    invoke-interface {v0}, Le/f/d/c0/a;->deserialize()Z

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    :goto_0
    return v1

    .line 11
    :cond_5
    iget-boolean v0, p0, Le/f/d/d0/p;->d:Z

    if-nez v0, :cond_6

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Le/f/d/d0/p;->b(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_6

    return v1

    .line 12
    :cond_6
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Le/f/d/d0/p;->a(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_7

    return v1

    :cond_7
    if-eqz p2, :cond_8

    .line 13
    iget-object p2, p0, Le/f/d/d0/p;->f:Ljava/util/List;

    goto :goto_1

    :cond_8
    iget-object p2, p0, Le/f/d/d0/p;->g:Ljava/util/List;

    .line 14
    :goto_1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    .line 15
    new-instance v0, Le/f/d/b;

    invoke-direct {v0, p1}, Le/f/d/b;-><init>(Ljava/lang/reflect/Field;)V

    .line 16
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Le/f/d/a;

    .line 17
    invoke-interface {p2, v0}, Le/f/d/a;->a(Le/f/d/b;)Z

    move-result p2

    if-eqz p2, :cond_9

    return v1

    :cond_a
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->isMemberClass()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Le/f/d/d0/p;->c(Ljava/lang/Class;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final c(Ljava/lang/Class;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    move-result p1

    and-int/lit8 p1, p1, 0x8

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public clone()Le/f/d/d0/p;
    .locals 1

    .line 2
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/d/d0/p;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 3
    :catch_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/d/d0/p;->clone()Le/f/d/d0/p;

    move-result-object v0

    return-object v0
.end method
