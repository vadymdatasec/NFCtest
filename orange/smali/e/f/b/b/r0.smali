.class public final Le/f/b/b/r0;
.super Le/f/b/b/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Le/f/b/b/h<",
        "TE;>;"
    }
.end annotation


# static fields
.field public static final i:[Ljava/lang/Object;

.field public static final j:Le/f/b/b/r0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/b/b/r0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final transient d:[Ljava/lang/Object;

.field public final transient e:I

.field public final transient f:[Ljava/lang/Object;

.field public final transient g:I

.field public final transient h:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x0

    new-array v4, v0, [Ljava/lang/Object;

    .line 1
    sput-object v4, Le/f/b/b/r0;->i:[Ljava/lang/Object;

    .line 2
    new-instance v0, Le/f/b/b/r0;

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, v4

    invoke-direct/range {v1 .. v6}, Le/f/b/b/r0;-><init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    sput-object v0, Le/f/b/b/r0;->j:Le/f/b/b/r0;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f/b/b/h;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/b/b/r0;->d:[Ljava/lang/Object;

    .line 3
    iput p2, p0, Le/f/b/b/r0;->e:I

    .line 4
    iput-object p3, p0, Le/f/b/b/r0;->f:[Ljava/lang/Object;

    .line 5
    iput p4, p0, Le/f/b/b/r0;->g:I

    .line 6
    iput p5, p0, Le/f/b/b/r0;->h:I

    return-void
.end method


# virtual methods
.method public a([Ljava/lang/Object;I)I
    .locals 3

    .line 2
    iget-object v0, p0, Le/f/b/b/r0;->d:[Ljava/lang/Object;

    iget v1, p0, Le/f/b/b/r0;->h:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3
    iget p1, p0, Le/f/b/b/r0;->h:I

    add-int/2addr p2, p1

    return p2
.end method

.method public a()[Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/b/b/r0;->d:[Ljava/lang/Object;

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/b/b/r0;->h:I

    return v0
.end method

.method public c()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Le/f/b/b/r0;->f:[Ljava/lang/Object;

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 2
    array-length v2, v0

    if-nez v2, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    invoke-static {p1}, Le/f/b/b/d;->a(Ljava/lang/Object;)I

    move-result v2

    .line 4
    :goto_0
    iget v3, p0, Le/f/b/b/r0;->g:I

    and-int/2addr v2, v3

    .line 5
    aget-object v3, v0, v2

    if-nez v3, :cond_1

    return v1

    .line 6
    :cond_1
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v1
.end method

.method public e()Le/f/b/b/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/b/b/g<",
            "TE;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/b/b/r0;->d:[Ljava/lang/Object;

    iget v1, p0, Le/f/b/b/r0;->h:I

    invoke-static {v0, v1}, Le/f/b/b/g;->b([Ljava/lang/Object;I)Le/f/b/b/g;

    move-result-object v0

    return-object v0
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/b/b/r0;->e:I

    return v0
.end method

.method public iterator()Le/f/b/b/u0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/b/b/u0<",
            "TE;>;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Le/f/b/b/h;->d()Le/f/b/b/g;

    move-result-object v0

    invoke-virtual {v0}, Le/f/b/b/g;->iterator()Le/f/b/b/u0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/b/b/r0;->iterator()Le/f/b/b/u0;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/b/b/r0;->h:I

    return v0
.end method
