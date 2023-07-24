.class public final Le/f/e/t/b/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:[Le/f/e/t/b/r;


# direct methods
.method public varargs constructor <init>(I[Le/f/e/t/b/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Le/f/e/t/b/s;->a:I

    .line 3
    iput-object p2, p0, Le/f/e/t/b/s;->b:[Le/f/e/t/b/r;

    return-void
.end method


# virtual methods
.method public a()[Le/f/e/t/b/r;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/e/t/b/s;->b:[Le/f/e/t/b/r;

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/e/t/b/s;->a:I

    return v0
.end method
