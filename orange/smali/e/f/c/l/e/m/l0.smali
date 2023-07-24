.class public Le/f/c/l/e/m/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/l/e/t/c;


# instance fields
.field public final synthetic a:Le/f/c/l/e/m/v0;


# direct methods
.method public constructor <init>(Le/f/c/l/e/m/v0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/m/l0;->a:Le/f/c/l/e/m/v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/c/l/e/v/j/b;)Le/f/c/l/e/t/f;
    .locals 9

    .line 1
    iget-object v0, p1, Le/f/c/l/e/v/j/b;->c:Ljava/lang/String;

    .line 2
    iget-object v1, p1, Le/f/c/l/e/v/j/b;->d:Ljava/lang/String;

    .line 3
    iget-object v3, p1, Le/f/c/l/e/v/j/b;->e:Ljava/lang/String;

    .line 4
    iget-object v2, p0, Le/f/c/l/e/m/l0;->a:Le/f/c/l/e/m/v0;

    invoke-static {v2, v0, v1}, Le/f/c/l/e/m/v0;->a(Le/f/c/l/e/m/v0;Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/t/h/c;

    move-result-object v7

    .line 5
    new-instance v0, Le/f/c/l/e/t/f;

    iget-object v1, p0, Le/f/c/l/e/m/l0;->a:Le/f/c/l/e/m/v0;

    .line 6
    invoke-static {v1}, Le/f/c/l/e/m/v0;->g(Le/f/c/l/e/m/v0;)Le/f/c/l/e/m/b;

    move-result-object v1

    iget-object v4, v1, Le/f/c/l/e/m/b;->a:Ljava/lang/String;

    .line 7
    invoke-static {p1}, Le/f/c/l/e/m/j1;->a(Le/f/c/l/e/v/j/b;)Le/f/c/l/e/m/j1;

    move-result-object v5

    iget-object p1, p0, Le/f/c/l/e/m/l0;->a:Le/f/c/l/e/m/v0;

    .line 8
    invoke-static {p1}, Le/f/c/l/e/m/v0;->e(Le/f/c/l/e/m/v0;)Le/f/c/l/e/t/a;

    move-result-object v6

    iget-object p1, p0, Le/f/c/l/e/m/l0;->a:Le/f/c/l/e/m/v0;

    .line 9
    invoke-static {p1}, Le/f/c/l/e/m/v0;->h(Le/f/c/l/e/m/v0;)Le/f/c/l/e/t/b;

    move-result-object v8

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Le/f/c/l/e/t/f;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/m/j1;Le/f/c/l/e/t/a;Le/f/c/l/e/t/h/c;Le/f/c/l/e/t/b;)V

    return-object v0
.end method
