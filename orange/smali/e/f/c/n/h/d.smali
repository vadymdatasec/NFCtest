.class public Le/f/c/n/h/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/n/a;


# instance fields
.field public final synthetic a:Le/f/c/n/h/f;


# direct methods
.method public constructor <init>(Le/f/c/n/h/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/n/h/d;->a:Le/f/c/n/h/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 5
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 6
    :try_start_0
    invoke-virtual {p0, p1, v0}, Le/f/c/n/h/d;->a(Ljava/lang/Object;Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    :catch_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/Object;Ljava/io/Writer;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v6, Le/f/c/n/h/g;

    iget-object v0, p0, Le/f/c/n/h/d;->a:Le/f/c/n/h/f;

    .line 2
    invoke-static {v0}, Le/f/c/n/h/f;->a(Le/f/c/n/h/f;)Ljava/util/Map;

    move-result-object v2

    iget-object v0, p0, Le/f/c/n/h/d;->a:Le/f/c/n/h/f;

    invoke-static {v0}, Le/f/c/n/h/f;->b(Le/f/c/n/h/f;)Ljava/util/Map;

    move-result-object v3

    iget-object v0, p0, Le/f/c/n/h/d;->a:Le/f/c/n/h/f;

    invoke-static {v0}, Le/f/c/n/h/f;->c(Le/f/c/n/h/f;)Le/f/c/n/c;

    move-result-object v4

    iget-object v0, p0, Le/f/c/n/h/d;->a:Le/f/c/n/h/f;

    invoke-static {v0}, Le/f/c/n/h/f;->d(Le/f/c/n/h/f;)Z

    move-result v5

    move-object v0, v6

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Le/f/c/n/h/g;-><init>(Ljava/io/Writer;Ljava/util/Map;Ljava/util/Map;Le/f/c/n/c;Z)V

    const/4 p2, 0x0

    .line 3
    invoke-virtual {v6, p1, p2}, Le/f/c/n/h/g;->a(Ljava/lang/Object;Z)Le/f/c/n/h/g;

    .line 4
    invoke-virtual {v6}, Le/f/c/n/h/g;->a()V

    return-void
.end method
