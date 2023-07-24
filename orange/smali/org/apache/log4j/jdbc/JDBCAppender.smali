.class public Lorg/apache/log4j/jdbc/JDBCAppender;
.super Lorg/apache/log4j/AppenderSkeleton;
.source "SourceFile"

# interfaces
.implements Lorg/apache/log4j/Appender;


# instance fields
.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/sql/Connection;

.field public l:Ljava/lang/String;

.field public m:I

.field public n:Ljava/util/ArrayList;

.field public o:Ljava/util/ArrayList;

.field public p:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V

    const-string v0, "jdbc:odbc:myDB"

    .line 2
    iput-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->h:Ljava/lang/String;

    const-string v0, "me"

    .line 3
    iput-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->i:Ljava/lang/String;

    const-string v0, "mypassword"

    .line 4
    iput-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->j:Ljava/lang/String;

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->k:Ljava/sql/Connection;

    const-string v0, ""

    .line 6
    iput-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->l:Ljava/lang/String;

    const/4 v0, 0x1

    .line 7
    iput v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->m:I

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->p:Z

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    iget v1, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->m:I

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->n:Ljava/util/ArrayList;

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    iget v1, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->m:I

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->o:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/AppenderSkeleton;->getLayout()Lorg/apache/log4j/Layout;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/apache/log4j/Layout;->format(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public a()Ljava/sql/Connection;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 9
    invoke-static {}, Ljava/sql/DriverManager;->getDrivers()Ljava/util/Enumeration;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "sun.jdbc.odbc.JdbcOdbcDriver"

    .line 10
    invoke-virtual {p0, v0}, Lorg/apache/log4j/jdbc/JDBCAppender;->setDriver(Ljava/lang/String;)V

    .line 11
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->k:Ljava/sql/Connection;

    if-nez v0, :cond_1

    .line 12
    iget-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->h:Ljava/lang/String;

    iget-object v1, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->i:Ljava/lang/String;

    iget-object v2, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->j:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ljava/sql/DriverManager;->getConnection(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/sql/Connection;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->k:Ljava/sql/Connection;

    .line 13
    :cond_1
    iget-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->k:Ljava/sql/Connection;

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lorg/apache/log4j/jdbc/JDBCAppender;->a()Ljava/sql/Connection;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    :try_start_1
    invoke-interface {v1}, Ljava/sql/Connection;->createStatement()Ljava/sql/Statement;

    move-result-object v0

    .line 4
    invoke-interface {v0, p1}, Ljava/sql/Statement;->executeUpdate(Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_0

    .line 5
    invoke-interface {v0}, Ljava/sql/Statement;->close()V

    .line 6
    :cond_0
    invoke-virtual {p0, v1}, Lorg/apache/log4j/jdbc/JDBCAppender;->a(Ljava/sql/Connection;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p1

    move-object v1, v0

    :goto_0
    if-eqz v0, :cond_1

    .line 7
    invoke-interface {v0}, Ljava/sql/Statement;->close()V

    .line 8
    :cond_1
    invoke-virtual {p0, v1}, Lorg/apache/log4j/jdbc/JDBCAppender;->a(Ljava/sql/Connection;)V

    throw p1
.end method

.method public a(Ljava/sql/Connection;)V
    .locals 0

    return-void
.end method

.method public append(Lorg/apache/log4j/spi/LoggingEvent;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getNDC()Ljava/lang/String;

    .line 2
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThreadName()Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getMDCCopy()V

    .line 4
    iget-boolean v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->p:Z

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;

    .line 6
    :cond_0
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getRenderedMessage()Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableStrRep()[Ljava/lang/String;

    .line 8
    iget-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    iget-object p1, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->n:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iget v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->m:I

    if-lt p1, v0, :cond_1

    .line 10
    invoke-virtual {p0}, Lorg/apache/log4j/jdbc/JDBCAppender;->flushBuffer()V

    :cond_1
    return-void
.end method

.method public close()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/jdbc/JDBCAppender;->flushBuffer()V

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->k:Ljava/sql/Connection;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->k:Ljava/sql/Connection;

    invoke-interface {v0}, Ljava/sql/Connection;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->k:Ljava/sql/Connection;

    invoke-interface {v0}, Ljava/sql/Connection;->close()V
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    iget-object v1, p0, Lorg/apache/log4j/AppenderSkeleton;->d:Lorg/apache/log4j/spi/ErrorHandler;

    const/4 v2, 0x0

    const-string v3, "Error closing connection"

    invoke-interface {v1, v3, v0, v2}, Lorg/apache/log4j/spi/ErrorHandler;->error(Ljava/lang/String;Ljava/lang/Exception;I)V

    :cond_0
    :goto_0
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lorg/apache/log4j/AppenderSkeleton;->g:Z

    return-void
.end method

.method public finalize()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/jdbc/JDBCAppender;->close()V

    return-void
.end method

.method public flushBuffer()V
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->o:Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->n:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/log4j/spi/LoggingEvent;

    .line 4
    :try_start_0
    invoke-virtual {p0, v1}, Lorg/apache/log4j/jdbc/JDBCAppender;->a(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-virtual {p0, v2}, Lorg/apache/log4j/jdbc/JDBCAppender;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    :goto_1
    iget-object v2, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->o:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v2

    .line 7
    :try_start_1
    iget-object v3, p0, Lorg/apache/log4j/AppenderSkeleton;->d:Lorg/apache/log4j/spi/ErrorHandler;

    const-string v4, "Failed to excute sql"

    const/4 v5, 0x2

    invoke-interface {v3, v4, v2, v5}, Lorg/apache/log4j/spi/ErrorHandler;->error(Ljava/lang/String;Ljava/lang/Exception;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 8
    :goto_2
    iget-object v2, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->o:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    throw v0

    .line 9
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->n:Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 10
    iget-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public getBufferSize()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->m:I

    return v0
.end method

.method public getLocationInfo()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->p:Z

    return v0
.end method

.method public getPassword()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->j:Ljava/lang/String;

    return-object v0
.end method

.method public getSql()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->l:Ljava/lang/String;

    return-object v0
.end method

.method public getURL()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->h:Ljava/lang/String;

    return-object v0
.end method

.method public getUser()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->i:Ljava/lang/String;

    return-object v0
.end method

.method public requiresLayout()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public setBufferSize(I)V
    .locals 1

    .line 1
    iput p1, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->m:I

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 3
    iget-object p1, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->o:Ljava/util/ArrayList;

    iget v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->m:I

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->ensureCapacity(I)V

    return-void
.end method

.method public setDriver(Ljava/lang/String;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/AppenderSkeleton;->d:Lorg/apache/log4j/spi/ErrorHandler;

    const/4 v1, 0x0

    const-string v2, "Failed to load driver"

    invoke-interface {v0, v2, p1, v1}, Lorg/apache/log4j/spi/ErrorHandler;->error(Ljava/lang/String;Ljava/lang/Exception;I)V

    :goto_0
    return-void
.end method

.method public setLocationInfo(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->p:Z

    return-void
.end method

.method public setPassword(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->j:Ljava/lang/String;

    return-void
.end method

.method public setSql(Ljava/lang/String;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->l:Ljava/lang/String;

    .line 2
    invoke-virtual {p0}, Lorg/apache/log4j/AppenderSkeleton;->getLayout()Lorg/apache/log4j/Layout;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lorg/apache/log4j/PatternLayout;

    invoke-direct {v0, p1}, Lorg/apache/log4j/PatternLayout;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lorg/apache/log4j/AppenderSkeleton;->setLayout(Lorg/apache/log4j/Layout;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lorg/apache/log4j/AppenderSkeleton;->getLayout()Lorg/apache/log4j/Layout;

    move-result-object v0

    check-cast v0, Lorg/apache/log4j/PatternLayout;

    invoke-virtual {v0, p1}, Lorg/apache/log4j/PatternLayout;->setConversionPattern(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public setURL(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->h:Ljava/lang/String;

    return-void
.end method

.method public setUser(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->i:Ljava/lang/String;

    return-void
.end method
