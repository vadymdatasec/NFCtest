.class public Lm/b/i/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm/b/k/s0;


# instance fields
.field public a:Ljava/lang/Appendable;

.field public b:Lm/b/i/g;


# direct methods
.method public constructor <init>(Ljava/lang/Appendable;Lm/b/i/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lm/b/i/s;->a:Ljava/lang/Appendable;

    .line 3
    iput-object p2, p0, Lm/b/i/s;->b:Lm/b/i/g;

    return-void
.end method


# virtual methods
.method public a(Lm/b/i/t;I)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lm/b/i/t;->i()Ljava/lang/String;

    move-result-object v0

    const-string v1, "#text"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    :try_start_0
    iget-object v0, p0, Lm/b/i/s;->a:Ljava/lang/Appendable;

    iget-object v1, p0, Lm/b/i/s;->b:Lm/b/i/g;

    invoke-virtual {p1, v0, p2, v1}, Lm/b/i/t;->c(Ljava/lang/Appendable;ILm/b/i/g;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    new-instance p2, Lorg/jsoup/SerializationException;

    invoke-direct {p2, p1}, Lorg/jsoup/SerializationException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_0
    :goto_0
    return-void
.end method

.method public b(Lm/b/i/t;I)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lm/b/i/s;->a:Ljava/lang/Appendable;

    iget-object v1, p0, Lm/b/i/s;->b:Lm/b/i/g;

    invoke-virtual {p1, v0, p2, v1}, Lm/b/i/t;->b(Ljava/lang/Appendable;ILm/b/i/g;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 2
    new-instance p2, Lorg/jsoup/SerializationException;

    invoke-direct {p2, p1}, Lorg/jsoup/SerializationException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
