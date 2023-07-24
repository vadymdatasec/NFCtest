.class public Le/f/c/l/e/t/h/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/l/e/t/h/c;


# instance fields
.field public final a:Le/f/c/l/e/t/h/d;

.field public final b:Le/f/c/l/e/t/h/e;


# direct methods
.method public constructor <init>(Le/f/c/l/e/t/h/d;Le/f/c/l/e/t/h/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/c/l/e/t/h/b;->a:Le/f/c/l/e/t/h/d;

    .line 3
    iput-object p2, p0, Le/f/c/l/e/t/h/b;->b:Le/f/c/l/e/t/h/e;

    return-void
.end method


# virtual methods
.method public a(Le/f/c/l/e/t/g/a;Z)Z
    .locals 3

    .line 1
    sget-object v0, Le/f/c/l/e/t/h/a;->a:[I

    iget-object v1, p1, Le/f/c/l/e/t/g/a;->c:Le/f/c/l/e/t/g/d;

    invoke-interface {v1}, Le/f/c/l/e/t/g/d;->e()Le/f/c/l/e/t/g/c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    iget-object v0, p0, Le/f/c/l/e/t/h/b;->b:Le/f/c/l/e/t/h/e;

    invoke-virtual {v0, p1, p2}, Le/f/c/l/e/t/h/e;->a(Le/f/c/l/e/t/g/a;Z)Z

    return v1

    .line 3
    :cond_1
    iget-object v0, p0, Le/f/c/l/e/t/h/b;->a:Le/f/c/l/e/t/h/d;

    invoke-virtual {v0, p1, p2}, Le/f/c/l/e/t/h/d;->a(Le/f/c/l/e/t/g/a;Z)Z

    return v1
.end method
