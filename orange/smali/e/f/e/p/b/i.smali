.class public final Le/f/e/p/b/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:[Le/f/e/p/b/h;


# direct methods
.method public constructor <init>(ILe/f/e/p/b/h;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, Le/f/e/p/b/i;->a:I

    const/4 p1, 0x1

    new-array p1, p1, [Le/f/e/p/b/h;

    const/4 v0, 0x0

    aput-object p2, p1, v0

    .line 5
    iput-object p1, p0, Le/f/e/p/b/i;->b:[Le/f/e/p/b/h;

    return-void
.end method

.method public synthetic constructor <init>(ILe/f/e/p/b/h;Le/f/e/p/b/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Le/f/e/p/b/i;-><init>(ILe/f/e/p/b/h;)V

    return-void
.end method

.method public constructor <init>(ILe/f/e/p/b/h;Le/f/e/p/b/h;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput p1, p0, Le/f/e/p/b/i;->a:I

    const/4 p1, 0x2

    new-array p1, p1, [Le/f/e/p/b/h;

    const/4 v0, 0x0

    aput-object p2, p1, v0

    const/4 p2, 0x1

    aput-object p3, p1, p2

    .line 8
    iput-object p1, p0, Le/f/e/p/b/i;->b:[Le/f/e/p/b/h;

    return-void
.end method

.method public synthetic constructor <init>(ILe/f/e/p/b/h;Le/f/e/p/b/h;Le/f/e/p/b/g;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Le/f/e/p/b/i;-><init>(ILe/f/e/p/b/h;Le/f/e/p/b/h;)V

    return-void
.end method


# virtual methods
.method public a()[Le/f/e/p/b/h;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/e/p/b/i;->b:[Le/f/e/p/b/h;

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/e/p/b/i;->a:I

    return v0
.end method
