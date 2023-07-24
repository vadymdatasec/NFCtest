.class public Le/h/d/a/a/q/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/h/d/a/a/q/c$a;
    }
.end annotation


# instance fields
.field public b:I

.field public c:Ljava/lang/String;

.field public d:[J

.field public e:Le/h/d/a/a/q/c$a;

.field public f:I


# direct methods
.method public constructor <init>(Le/h/d/a/a/q/b;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Le/h/d/a/a/q/b;->a(Le/h/d/a/a/q/b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/h/d/a/a/q/c;->c:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Le/h/d/a/a/q/b;->b(Le/h/d/a/a/q/b;)I

    .line 5
    invoke-static {p1}, Le/h/d/a/a/q/b;->c(Le/h/d/a/a/q/b;)[J

    move-result-object v0

    iput-object v0, p0, Le/h/d/a/a/q/c;->d:[J

    .line 6
    invoke-static {p1}, Le/h/d/a/a/q/b;->d(Le/h/d/a/a/q/b;)I

    .line 7
    invoke-static {p1}, Le/h/d/a/a/q/b;->e(Le/h/d/a/a/q/b;)Le/h/d/a/a/q/c$a;

    move-result-object v0

    iput-object v0, p0, Le/h/d/a/a/q/c;->e:Le/h/d/a/a/q/c$a;

    .line 8
    invoke-static {p1}, Le/h/d/a/a/q/b;->f(Le/h/d/a/a/q/b;)I

    move-result v0

    iput v0, p0, Le/h/d/a/a/q/c;->f:I

    .line 9
    invoke-static {p1}, Le/h/d/a/a/q/b;->g(Le/h/d/a/a/q/b;)I

    move-result p1

    iput p1, p0, Le/h/d/a/a/q/c;->b:I

    return-void
.end method

.method public synthetic constructor <init>(Le/h/d/a/a/q/b;Le/h/d/a/a/q/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Le/h/d/a/a/q/c;-><init>(Le/h/d/a/a/q/b;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Le/h/d/a/a/q/c;->b:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/d/a/a/q/c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()Le/h/d/a/a/q/c$a;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/d/a/a/q/c;->e:Le/h/d/a/a/q/c$a;

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Le/h/d/a/a/q/c;->f:I

    return v0
.end method

.method public e()[J
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/d/a/a/q/c;->d:[J

    return-object v0
.end method
