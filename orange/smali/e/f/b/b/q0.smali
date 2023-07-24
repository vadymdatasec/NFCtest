.class public Le/f/b/b/q0;
.super Le/f/b/b/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Le/f/b/b/g<",
        "TE;>;"
    }
.end annotation


# static fields
.field public static final f:Le/f/b/b/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/b/b/g<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final transient d:[Ljava/lang/Object;

.field public final transient e:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Le/f/b/b/q0;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, Le/f/b/b/q0;-><init>([Ljava/lang/Object;I)V

    sput-object v0, Le/f/b/b/q0;->f:Le/f/b/b/g;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f/b/b/g;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/b/b/q0;->d:[Ljava/lang/Object;

    .line 3
    iput p2, p0, Le/f/b/b/q0;->e:I

    return-void
.end method


# virtual methods
.method public a([Ljava/lang/Object;I)I
    .locals 3

    .line 2
    iget-object v0, p0, Le/f/b/b/q0;->d:[Ljava/lang/Object;

    iget v1, p0, Le/f/b/b/q0;->e:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3
    iget p1, p0, Le/f/b/b/q0;->e:I

    add-int/2addr p2, p1

    return p2
.end method

.method public a()[Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/b/b/q0;->d:[Ljava/lang/Object;

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/b/b/q0;->e:I

    return v0
.end method

.method public c()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 1
    iget v0, p0, Le/f/b/b/q0;->e:I

    invoke-static {p1, v0}, Le/f/b/a/p;->a(II)I

    .line 2
    iget-object v0, p0, Le/f/b/b/q0;->d:[Ljava/lang/Object;

    aget-object p1, v0, p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/b/b/q0;->e:I

    return v0
.end method
